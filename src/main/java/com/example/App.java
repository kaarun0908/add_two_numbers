package com.example;

import java.util.Scanner;

/**
 * Program to add two numbers.
 */
public class App {

    /**
     * Adds two integers.
     *
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // If arguments are provided via CLI, use them
        if (args.length >= 2) {
            try {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input arguments. Defaulting to 10 and 20.");
            }
        }

        int result = add(num1, num2);
        System.out.println("=== Addition of Two Numbers ===");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum           : " + result);
    }
}
