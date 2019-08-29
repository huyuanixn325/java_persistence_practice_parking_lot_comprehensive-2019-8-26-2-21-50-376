package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingLot;

@Mapper
public interface ParkingLotMapper {

    void insertParkingLot(@Param("parkingLot")ParkingLot parkingLot);
}
