package homework;

import java.util.Scanner;

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if(a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Invalid sides for a triangle!");
            System.exit(0);
        }
    }

    public double getPerimeter() {
        return a+b+c;
    }

    public double getArea() {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter());
        System.out.println("Area of the triangle is: " + triangle.getArea());
    }
}

