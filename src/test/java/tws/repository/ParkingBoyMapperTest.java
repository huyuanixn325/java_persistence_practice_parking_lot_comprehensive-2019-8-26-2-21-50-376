package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingBoy;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingBoyMapperTest {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    @Test
    public void insertParkingBoy() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(2,"lunan",18);
        //when
        parkingBoyMapper.insertParkingBoy(parkingBoy);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parking_boy"));

    }

    @Test
    public void selectAllParkingBoys() {
       // jdbcTemplate.execute("  insert  into `parking_boy` (`employeeID`,`parkingBoyName`,`age`) values(2,'lunan',18)");
    }

    @Test
    public void selectAllParkingDtos() {
    }
}