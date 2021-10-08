package com.example.taskOfRest.string_operation;


import java.util.Arrays;
import java.util.Objects;

public class MinValueArray {

    int minValue;


    public MinValueArray(int minValue) {
        this.minValue = minValue;
    }


    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinValueArray that = (MinValueArray) o;
        return minValue == that.minValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minValue);
    }
}
