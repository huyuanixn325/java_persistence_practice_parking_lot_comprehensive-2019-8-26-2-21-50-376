package tws.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingLotControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void should_return_isCreated_when_given_a_post_request_parkingboylots() throws Exception {
        mockMvc.perform(post("/parking-lots").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE).content("{\"parkingLotID\":2,\"capatity\":1,\"availablePositionCount\":1,\"employeeID\":1}"))
                .andDo(print())
                .andExpect(status().isCreated());
    }

}