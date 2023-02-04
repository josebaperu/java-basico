package com.github.josebaperu.javabasico.calculatorProject;
import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer firstNumber,secondNumber;
        String operation;

        System.out.println("First number");
        firstNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Select operation: + - * / ");
        operation = sc.nextLine();

        System.out.println("Second number");
        secondNumber = Integer.parseInt(sc.nextLine());

        if (operation.equals("+")){
            System.out.println("result of sum " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println("result of substraction " + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            System.out.println("result of multiplication " + (firstNumber * secondNumber));
        } else if (operation.equals("/")) {
            System.out.println("result of division " + ((double) firstNumber / secondNumber));
        } else {
            System.out.println("operation not recognized");
        }
    }
}