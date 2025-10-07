package org.example;

public class Factorial {
    public static int Factorial(int number){
        int result = 1;

        for (int i = 1; i <= number; i++){
            result *= i;
        }

        return result;
    }
}
