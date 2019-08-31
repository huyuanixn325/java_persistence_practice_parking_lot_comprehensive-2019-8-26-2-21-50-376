package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingLot;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotMapperTest {
   @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    ParkingLotMapper parkingLotMapper;
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertParkingLot() {
        //given
        ParkingLot parkingLot = new ParkingLot(6,1,1,2);
        //when
        parkingLotMapper.insertParkingLot(parkingLot);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parking_lot"));
    }

    @Test
    public void selectAllParkingLots() {
    }
}