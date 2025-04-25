package Task2;

public class Truck extends Car{

    public Truck(String vinNumber, String make, String model, String mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        System.out.println(super.getInfo() + " Towing Capacity: " + towingCapacity);
    }
}
