public class Empoyee2 {
    private String name;
    private int yearOfJoining;
    private double salary;
    private int workingHours;
    private String address;

    public Empoyee2 (String name, int yearOfJoining, double salary, int workingHours, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.workingHours = workingHours;
        this.address = address;
    }

    public void printInfo() {
        System.out.println(name + " " + yearOfJoining + " " + salary + "$ " + workingHours + " hours " + address);
    }

    public void getInfo(double salary, int workingHours) {
        this.salary = salary;
        this.workingHours = workingHours;
    }

    public void AddSal() {
        if (salary < 1100) {
            salary += 10;
        }
    }

    public void AddWork() {
        if (workingHours > 6) {
            salary += 5;
        }
    }

    public void printSalary() {
        System.out.println(name + "'s final salary is " + salary + "$");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 2004, 2000, 8, "64C WallsStreet");
        Employee employee2 = new Employee("Sam", 2020, 1300, 6, "68D WallsStreet");
        Employee employee3 = new Employee("John", 2019, 1000, 7, "26B WallsStreet");

        employee1.getInfo(2000, 8);
        employee1.AddSal();
        employee1.AddWork();
        employee1.printSalary();

        employee2.getInfo(1300, 6);
        employee2.AddSal();
        employee2.AddWork();
        employee2.printSalary();

        employee3.getInfo(1000, 7);
        employee3.AddSal();
        employee3.AddWork();
        employee3.printSalary();
    }
}
