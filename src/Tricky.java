class CarTester
{
    public static void main(String s[]) {
        Car car = new Car("Maruti", "Wagon R", 1000, 12.4);
        System.out.println(car.company + "'s " + car.model + " has engine power of " + car.cc + "cc.");
    }
}
class Car
{
    Car(String company, String model, int cc, double mileage)
    {
        company = company;
        model = model;
        cc = cc;
        mileage = mileage;
    }
    String company;
    String model;
    int cc;
    double mileage;
}