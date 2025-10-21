package org.example;

public class Iterative {

    public long iterative(int number) {
        long result = 1;
        for(int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

