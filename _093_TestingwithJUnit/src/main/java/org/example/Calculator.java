package org.example;

public class Calculator {
    public int add(int ... numbers){
        int sum = 0 ;
        for (int number:numbers){
            sum = sum + number;
        }
        return sum;

    }
}
