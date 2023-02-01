package com.github.josebaperu.javabasico.calculatorProject;

import java.util.Scanner;

public class newCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number;
        boolean  isValid = false;
        int maxCounter = 0;
        while (!isValid) {
            try{
                if (maxCounter == 3){
                    System.out.println("Max number of attempts reached: " + maxCounter + ", exiting");
                    System.exit(0);
                }

            }
        }
    }
}
