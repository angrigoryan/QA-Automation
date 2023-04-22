package homework;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getBreadth() {
        return breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);

        System.out.println("Area of the rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());

        scanner.close();
    }
}