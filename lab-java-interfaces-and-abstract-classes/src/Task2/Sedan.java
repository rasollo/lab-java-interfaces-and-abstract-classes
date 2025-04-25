package Task2;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, String mileage) {
        super(vinNumber, make, model, mileage);
        System.out.println(super.getInfo());
    }
}
