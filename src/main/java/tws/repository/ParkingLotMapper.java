package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ParkingLotMapper {

    void insertParkingLot(@Param("parkingLot")ParkingLot parkingLot);
    List<ParkingLot> selectAllParkingLots();
}
