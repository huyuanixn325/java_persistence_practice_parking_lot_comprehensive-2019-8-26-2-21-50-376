package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;
import tws.repository.ParkingBoyMapper;

import java.util.List;

@Service
public class ParkingBoyService {

    @Autowired
    ParkingBoyMapper parkingBoyMapper;

    public void addParkingBoy(ParkingBoy parkingBoy){
        parkingBoyMapper.insertParkingBoy(parkingBoy);
    }

    public List<ParkingBoy> selectAllParkingBoy(){
        return parkingBoyMapper.selectAllParkingBoys();
    }

    public List<ParkingBoyDto> getAllParkingBoyDtos(){
        return parkingBoyMapper.selectAllParkingDtos();
    }
}
