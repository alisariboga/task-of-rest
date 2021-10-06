package com.example.taskOfRest.string_operation;

import java.util.Objects;

public class ResultAnagram {

    String attribute1;
    String attribute2;
    String result;

    public ResultAnagram(String word1, String word2, String result) {
        this.attribute1 = word1;
        this.attribute2 = word2;
        this.result = result;
    }


    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultAnagram that = (ResultAnagram) o;
        return Objects.equals(attribute1, that.attribute1) && Objects.equals(attribute2, that.attribute2) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute1, attribute2, result);
    }


}
