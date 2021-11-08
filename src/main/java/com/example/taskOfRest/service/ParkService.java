package com.example.taskOfRest.service;

import com.example.taskOfRest.entity.Park;
import org.springframework.stereotype.Service;

@Service
public class ParkService {
    public Park findCarParkAndKindOfCarAndFindHandicappedSpots(boolean hasCarPark, int kindOfCars, int handicappedSpots) {
//        double counter = Math.random() * 100;
//        kindOfCars = (int) counter;
//
//        double doubleHandicappedSpots = Math.random() * 100;
//
//        handicappedSpots = (int) doubleHandicappedSpots;
//        System.out.println(kindOfCars);

        if (hasCarPark)
            return new Park(true, kindOfCars, handicappedSpots);
        else {
            return new Park(false, kindOfCars, handicappedSpots);
        }
    }
}
