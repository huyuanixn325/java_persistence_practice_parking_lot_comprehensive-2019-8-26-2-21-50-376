package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingBoy;

import java.util.List;

@Mapper
public interface ParkingBoyMapper {

    void insertParkingBoy(@Param("parkingBoy") ParkingBoy parkingBoy);
    List<ParkingBoy> selectAllParkingBoys();
}
