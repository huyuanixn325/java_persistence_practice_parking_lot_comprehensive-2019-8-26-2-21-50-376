package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;
import tws.service.ParkingBoyService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parking-boys")
public class ParkingBoyController {

    @Autowired
    ParkingBoyService parkingBoyService;
    //AC1
    @PostMapping
    public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        parkingBoyService.addParkingBoy(parkingBoy);
        return ResponseEntity.created(URI.create("/parking-boys/"+parkingBoy.getEmployeeID())).build();
    }

    @GetMapping
    public ResponseEntity<List<ParkingBoy>> selectAllParkingBoy(){
       List<ParkingBoy> parkingBoys =  parkingBoyService.selectAllParkingBoy();
       return ResponseEntity.ok(parkingBoys);
    }

    @GetMapping("/parking-boys-dto")
    public ResponseEntity<List<ParkingBoyDto>> getAllParkingBoyDtos(){

        return ResponseEntity.ok(parkingBoyService.getAllParkingBoyDtos());
    }
}
