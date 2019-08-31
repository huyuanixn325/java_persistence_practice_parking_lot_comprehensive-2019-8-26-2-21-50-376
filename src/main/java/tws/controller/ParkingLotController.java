package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;
import tws.service.ParkingLotService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/parking-lots")
public class ParkingLotController {
    @Autowired
    ParkingLotService parkingLotService;
    @PostMapping
    public ResponseEntity<ParkingLot> insertParkingLot(@RequestBody ParkingLot parkingLot){
        parkingLotService.insertParkingLot(parkingLot);
        return ResponseEntity.created( URI.create("/parking-lot"+parkingLot.getParkingLotID())).build();
    }
    @GetMapping
    public ResponseEntity<List<ParkingLot>> selectParkingLots(){
        List<ParkingLot> parkingLots = parkingLotService.selectParkingLots();
        return ResponseEntity.ok(parkingLots);
    }
}
