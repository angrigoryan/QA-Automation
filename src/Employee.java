/*
Write a program that would print the information (name, year of joining, salary, workingHours,
        address) of three employees by creating a class named 'Employee'. The output should be as
        follows: Name Year of joining Salary Address Robert 2004 2000$ 64C
        WallsStreat Sam 2020 1300$ 68D- WallsStreat. John 2019 1000k
        26B- WallsStreat

*/


public class Employee {
    private static String name;
    private static int yearOfJoining;
    private static double salary;
    private static int workingHours;
    private static String address;

    public Employee(String name, int yearOfJoining, double salary, int workingHours, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.workingHours = workingHours;
        this.address = address;
    }

    public Employee(String robert, int yearOfJoining, int salary, int workingHours, Address address1) {
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 2004, 2000, 8, "64C WallsStreet");
        System.out.println(name + " " + yearOfJoining + " " + salary + "$ " + workingHours + " hours " + address);

        Employee employee2 = new Employee("Sam", 2020, 1300, 6, "68D WallsStreet");
        System.out.println(name + " " + yearOfJoining + " " + salary + "$ " + workingHours + " hours " + address);

        Employee employee3 = new Employee("John", 2019, 1000, 7, "26B WallsStreet");
        System.out.println(name + " " + yearOfJoining + " " + salary + "$ " + workingHours + " hours " + address);
    }

    public void printSalary() {
    }

    public void AddWork() {
    }

    public void AddSal() {
    }

    public void getInfo(int i, int i1) {
    }
}
