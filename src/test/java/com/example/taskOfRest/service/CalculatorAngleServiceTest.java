package com.example.taskOfRest.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorAngleServiceTest {
    @Test
    public void test_calculatingTheAngleBetweenTheHourAndMinuteHands() throws Exception {
        CalculatorAngleService calculatorAngleService = new CalculatorAngleService();

        Double calculateAngle1Past23 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(1, 23);
        assertTrue(calculateAngle1Past23 == 96.5);

        Double calculateAngle18Past33 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(8, 33);
        assertTrue(calculateAngle18Past33 == 58.5);

        Double calculateAngle3Past37 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(3, 37);
        assertTrue(calculateAngle3Past37 == 113.5);

        Double calculateAngle11Past28 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(11, 28);
        assertTrue(calculateAngle11Past28 == 176);

        Double calculateAngle0Past30 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(0, 30);
        assertTrue(calculateAngle0Past30 == 165);

        Double calculateAngle3Past30 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(3, 30);
        assertTrue(calculateAngle3Past30 == 75);

        Double calculateAngle5Past30 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(5, 30);
        assertTrue(calculateAngle5Past30 == 15);

        Double calculateAngle9Oclock = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(9, 0);
        assertTrue(calculateAngle9Oclock == 90);

        Double calculateAngle0Oclock = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(0, 0);
        assertTrue(calculateAngle0Oclock == 0);

        Double calculateAngle6OPast01 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(6, 1);
        assertTrue(calculateAngle6OPast01 == 174.5);

        Double calculateAngle11OPast59 = calculatorAngleService.calculatingTheAngleBetweenTheHourAndMinuteHands(11, 59);
        assertTrue(calculateAngle11OPast59 == 5.5);
    }
}
