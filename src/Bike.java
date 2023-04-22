public class Bike {
    public int cc;
    String company;
    String model;
    double mileage;
    boolean diskBrakes;
    int engineCC;

    public Bike(String company, String model, int engineCC) {
        this.company = company;
        this.model = model;
        this.engineCC = engineCC;

    }

    public Bike() {

    }

    public static void main(String s[])
    {
        Bike bike = new Bike("Hero Honda", "Shine", 125);
        bike.mileage = 72.5;
        bike.diskBrakes = false;
        System.out.println(bike.company + "'s " + bike.model + " gives a mileage of " + bike.mileage + "kmpl.");
    }
}
