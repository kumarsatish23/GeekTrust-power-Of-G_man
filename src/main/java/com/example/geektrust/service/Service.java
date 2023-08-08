package com.example.geektrust.service;

import java.util.List;

import com.example.geektrust.destination.Destination;
import com.example.geektrust.powercalculator.PowerCalculator;
import com.example.geektrust.source.Source;

public class Service {
    public int remainingPower(List<String> inputList) {
        Source source = null;
        Destination destination = null;

        for (String input : inputList) {
            if (input.contains("SOURCE")) {
                String[] inputArray = input.split(" ");
                int xCoordinate = Integer.parseInt(inputArray[1]);
                int yCoordinate = Integer.parseInt(inputArray[2]);
                char direction = inputArray[3].charAt(0);
                source = new Source(xCoordinate, yCoordinate, direction);
            } else if (input.contains("DESTINATION")) {
                String[] inputArray = input.split(" ");
                int xCoordinate = Integer.parseInt(inputArray[1]);
                int yCoordinate = Integer.parseInt(inputArray[2]);
                destination = new Destination(xCoordinate, yCoordinate);
            }
        }

        if (source == null || destination == null) {
            throw new IllegalArgumentException("Missing source or destination information.");
        }

        PowerCalculator powerCalculator = new PowerCalculator();
        int remainingPower = 200 - powerCalculator.calculateDistancePower(source, destination);
        return remainingPower;
    }
}
