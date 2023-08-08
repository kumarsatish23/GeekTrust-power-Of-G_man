package com.example.geektrust.source;

public class Source {

    private Integer xCoordinates;
    private Integer yCoordinates;
    private Character direction;

    public Source() {}

    public Source(int xCoordinates, int yCoordinates, char direction) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.direction = direction;
    }

    public Integer getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(Integer xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public Integer getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(Integer yCoordinates) {
        this.yCoordinates = yCoordinates;
    }

    public Character getDirection() {
        return direction;
    }

    public void setDirection(Character direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Source [xCoordinates=" + xCoordinates + ", yCoordinates=" + yCoordinates + ", direction=" + direction + "]";
    }
}
