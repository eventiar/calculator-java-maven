package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Calculator calculator;

        switch (operator) {
            case '+':
                calculator = new Addition();
                break;
            case '-':
                calculator = new Subtraction();
                break;
            case '*':
                calculator = new Multiplication();
                break;
            case '/':
                calculator = new Division();
                break;
            default:
                System.out.println("Error: Invalid operator");
                scanner.close();
                return;
        }

        try {
            double result = calculator.calculate(firstNumber, secondNumber);
            System.out.printf("Result: %.2f\n", result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
