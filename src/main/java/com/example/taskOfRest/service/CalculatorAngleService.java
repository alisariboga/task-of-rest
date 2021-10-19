package com.example.taskOfRest.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorAngleService {
    public Double calculatingTheAngleBetweenTheHourAndMinuteHands(double hour, double minute) {
        Double result = (30 * hour) - (5.5 * minute);
        Double angle = Math.abs(result);
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

}
