package Task2;

public class UtilityVehicle extends Car {
    public UtilityVehicle(String vinNumber, String make, String model, String mileage, Boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        System.out.println(super.getInfo() + " Four Wheel: " + fourWheelDrive);
    }
}
