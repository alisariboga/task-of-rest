package com.example.taskOfRest.string_operation;


import java.util.Arrays;
import java.util.Objects;

public class MinValueArray {
    int[] newArray;
    int minValue;

    public MinValueArray(int[] newArray, int minValue) {
        this.newArray = newArray;
        this.minValue = minValue;
    }

    public MinValueArray() {
    }

    public int[] getNewArray() {
        return newArray;
    }

    public void setNewArray(int[] newArray) {
        this.newArray = newArray;
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
        return minValue == that.minValue && Arrays.equals(newArray, that.newArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(minValue);
        result = 31 * result + Arrays.hashCode(newArray);
        return result;
    }
}
