package com.github.josebaperu.javabasico.scanner;

import java.util.Scanner;

public class NumberInputExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number;
        boolean isValid = false;
        int maxCounter = 0;
        while (!isValid) {
            try {
                if(maxCounter == 3) {
                    System.out.println("Max number of attempts reached: " + maxCounter + ", exiting");
                    System.exit(0);
                }
                System.out.println("Please input a number, or X to exit, attempt : " + maxCounter);
                String input = sc.next();
                if(input.equals("x")) {
                    System.out.println("Exiting program");
                    System.exit(0);
                }
                number = Integer.parseInt(input);
                isValid = true;
                System.out.println(number +" to the power of 2, is: " + Math.pow(number, 2));
            } catch (NumberFormatException nfe) {
                maxCounter = maxCounter + 1;
                System.out.println(" input is not a number, try again");
            }
        }
    }
}
