package homework;

import java.util.Scanner;

public class ActionsWithNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operation (+, -, *): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("The sum is: " + sum(num1, num2));
                break;
            case '-':
                System.out.println("The difference is: " + difference(num1, num2));
                break;
            case '*':
                System.out.println("The product is: " + product(num1, num2));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        input.close();
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double product(double a, double b) {
        return a * b;
    }
}