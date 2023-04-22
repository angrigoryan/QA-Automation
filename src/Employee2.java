class Employee2 {
    private String name;
    private int yearOfJoining;
    private double salary;
    private int workingHours;
    private Address address;

    public Employee2 (String name, int yearOfJoining, double salary, int workingHours, Address address) {
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
        Address address1 = new Address("64C WallsStreet", "New York", "NY");
        Address address2 = new Address("68D WallsStreet", "New York", "NY");
        Address address3 = new Address("26B WallsStreet", "New York", "NY");

        Employee empoyee1 = new Employee("Robert", 2004, 2000, 8, address1);
        Employee empoyee2 = new Employee("Sam", 2020, 1300, 6, address2);
        Employee empoyee3 = new Employee("John", 2019, 1000, 7, address3);

        empoyee1.getInfo(2000, 8);
        empoyee1.AddSal();
        empoyee1.AddWork();
        empoyee1.printSalary();

        empoyee2.getInfo(1300, 6);
        empoyee2.AddSal();
        empoyee2.AddWork();
        empoyee2.printSalary();

        empoyee3.getInfo(1000, 7);
        empoyee3.AddSal();
        empoyee3.AddWork();
        empoyee3.printSalary();
    }
}
