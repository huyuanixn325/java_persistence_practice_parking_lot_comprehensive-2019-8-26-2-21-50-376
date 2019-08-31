package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.ParkingBoy;
import tws.entity.ParkingLot;
import tws.repository.ParkingLotMapper;

import java.util.List;

@Service
public class ParkingLotService {

    @Autowired
    ParkingLotMapper parkingLotMapper;

    public void insertParkingLot(ParkingLot parkingLot){
        parkingLotMapper.insertParkingLot(parkingLot);
    }

    public List<ParkingLot> selectParkingLots(){
        return parkingLotMapper.selectAllParkingLots();
    }
}
