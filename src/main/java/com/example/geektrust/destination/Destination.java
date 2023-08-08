package com.example.geektrust.destination;

public class Destination {
    private int xCoordinates;
    private int yCoordinates;

    public Destination() {}

    public Destination(int xCoordinates, int yCoordinates) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }

    @Override
    public String toString() {
        return "Destination [xCoordinates=" + xCoordinates + ", yCoordinates=" + yCoordinates + "]";
    }
}
