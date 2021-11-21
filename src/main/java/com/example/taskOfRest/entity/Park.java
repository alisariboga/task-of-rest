package com.example.taskOfRest.entity;

import java.util.Objects;

public class Park {
    private boolean hasCarPark;
    private int kindOfCars;
    private int handicappedSpots;

    public Park(boolean hasCarPark, int kindOfCars, int handicappedSpots) {
        this.hasCarPark = hasCarPark;
        this.kindOfCars = kindOfCars;
        this.handicappedSpots = handicappedSpots;
    }

    public boolean getHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public int getKindOfCars() {
        return kindOfCars;
    }

    public void setKindOfCars(int kindOfCars) {
        this.kindOfCars = kindOfCars;
    }

    public int getHandicappedSpots() {
        return handicappedSpots;
    }

    public void setHandicappedSpots(int handicappedSpots) {
        this.handicappedSpots = handicappedSpots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return hasCarPark == park.hasCarPark && kindOfCars == park.kindOfCars && handicappedSpots == park.handicappedSpots;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasCarPark, kindOfCars, handicappedSpots);
    }
}
