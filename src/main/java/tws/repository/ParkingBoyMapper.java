package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingBoy;

@Mapper
public interface ParkingBoyMapper {

    void insertParkingBoy(@Param("parkingBoy") ParkingBoy parkingBoy);
}
