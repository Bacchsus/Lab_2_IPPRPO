package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iterative iterative = new Iterative();
        Recursive recursive = new Recursive();
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.printf("Iterative factorial of %d is %d%n",
                a, iterative.iterative(a));
        System.out.printf("Recursive factorial of %d is %d%n",
                a, recursive.recursive(a));
    }
}