package com.example.taskOfRest.service;

import com.example.taskOfRest.entity.Park;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkServiceServiceTest {

    @Test
    public void test_ParkService() throws Exception {
        ParkService parkService = new ParkService();

        Park park1 = new Park(true, 23, 5);
        Park park2 = new Park(false, 21, 10);

        Park checkHasCarPark = parkService.findCarParkAndKindOfCarAndFindHandicappedSpots(true, 23, 5);
        assertTrue(new Park(checkHasCarPark.getHasCarPark(), checkHasCarPark.getKindOfCars(), checkHasCarPark.getHandicappedSpots()).equals(park1));

        Park checkHasCarPark1 = parkService.findCarParkAndKindOfCarAndFindHandicappedSpots(false, 21, 10);
        assertTrue(new Park(checkHasCarPark1.getHasCarPark(), checkHasCarPark1.getKindOfCars(), checkHasCarPark1.getHandicappedSpots()).equals(park2));

    }
}
