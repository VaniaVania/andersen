package com.andersen.ivan;

public class Plane {
    int maxSpeed;
    int year;

    public Plane(int maxSpeed, int year) {
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
