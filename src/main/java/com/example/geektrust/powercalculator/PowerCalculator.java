package com.example.geektrust.powercalculator;

import com.example.geektrust.destination.Destination;
import com.example.geektrust.source.Source;

public class PowerCalculator {
    public int calculateDistancePower(Source source, Destination destination) {
        int dx = Math.abs(source.getxCoordinates() - destination.getxCoordinates());
        int dy = Math.abs(source.getyCoordinates() - destination.getyCoordinates());

        int distancePower = 10 * (dx + dy);
        int directionPower = 5 * calculateDirectionPower(source, destination);

        return distancePower + directionPower;
    }

    public int calculateDirectionPower(Source source, Destination destination) {
        char direction = source.getDirection();
        int sourceX = source.getxCoordinates();
        int sourceY = source.getyCoordinates();
        int destX = destination.getxCoordinates();
        int destY = destination.getyCoordinates();

        int dx = destX - sourceX;
        int dy = destY - sourceY;

        double angle = Math.atan2(dy, dx);
        double bearing = (90 - Math.toDegrees(angle) + 360) % 360;

        int rotations = (int) (bearing / 90);

        int initialBearingRotations = getInitialBearingRotations(direction);
        int clockwiseRotations = (rotations - initialBearingRotations + 4) % 4;
        int counterclockwiseRotations = 4 - clockwiseRotations;

        return Math.min(clockwiseRotations, counterclockwiseRotations);
    }

    private int getInitialBearingRotations(char direction) {
        switch (direction) {
            case 'N':
                return 0;
            case 'E':
                return 1;
            case 'S':
                return 2;
            case 'W':
                return 3;
            default:
                return 0;
        }
    }
}
