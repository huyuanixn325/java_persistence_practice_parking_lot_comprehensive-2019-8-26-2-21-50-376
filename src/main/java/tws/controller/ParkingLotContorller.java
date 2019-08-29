package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.repository.ParkingLotMapper;

@RestController
@RequestMapping("/parking-lot")
public class ParkingLotContorller {
    @Autowired
    ParkingLotMapper parkingLotMapper;

}
