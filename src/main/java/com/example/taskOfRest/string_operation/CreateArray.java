package com.example.taskOfRest.string_operation;

import java.util.Arrays;

public class CreateArray {
    int[] newArray;

    public CreateArray() {
    }

    public CreateArray(int[] newArray) {
        this.newArray = newArray;
    }

    public int[] getNewArray() {
        return newArray;
    }

    public void setNewArray(int[] newArray) {
        this.newArray = newArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateArray that = (CreateArray) o;
        return Arrays.equals(newArray, that.newArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(newArray);
    }
}
