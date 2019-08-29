package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parking-boys")
public class ParkingBoyController {
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    //AC1
    @PostMapping
    public ResponseEntity<ParkingBoy> addParkingBoy(@RequestBody ParkingBoy parkingBoy){
        parkingBoyMapper.insertParkingBoy(parkingBoy);
        return ResponseEntity.created(URI.create("/parking-boys/"+parkingBoy.getEmployeeID())).build();
    }

    @GetMapping
    public ResponseEntity<List<ParkingBoy>> selectAllParkingBoy(){
       List<ParkingBoy> parkingBoys =  parkingBoyMapper.selectAllParkingBoys();
       return ResponseEntity.ok(parkingBoys);
    }
}
