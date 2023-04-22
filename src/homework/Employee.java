package homework;

import java.util.Scanner;

class Employee {
    private String name;
    private int year;
    double salary;
    private String address;

    public Employee(String name, int year, double salary, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }

    public void getInfo(double salary, int hours) {
        this.salary = salary;
        if (hours > 6) {
            AddWork();
        }
        if (this.salary < 1100) {
            AddSal();
        }
    }

    public void AddSal() {
        this.salary += 10;
    }

    public void AddWork() {
        this.salary += 5;
    }

    public void printInfo() {
        System.out.println(name + " " + year + " " + salary + " " + address);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of employee " + (i + 1));
            String name = scanner.nextLine();

            System.out.println("Enter year of joining of employee " + (i + 1));
            int year = scanner.nextInt();

            System.out.println("Enter salary of employee " + (i + 1));
            double salary = scanner.nextDouble();

            System.out.println("Enter address of employee " + (i + 1));
            scanner.nextLine();
            String address = scanner.nextLine();

            employees[i] = new Employee(name, year, salary, address);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number of hours of work per day of employee " + (i + 1));
            int hours = scanner.nextInt();
            employees[i].getInfo(employees[i].salary, hours);
            employees[i].printInfo();
        }

        scanner.close();
    }
}

