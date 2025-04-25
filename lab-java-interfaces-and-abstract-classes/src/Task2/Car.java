package Task2;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private String mileage;
    public String getInfo(){
//        System.out.println("VIN Number: " + vinNumber + "Year: " + make + "Model: " + model + "Mileage: " + mileage);
        return ("VIN Number: " + vinNumber + " Year: " + make + " Model: " + model + " Mileage: " + mileage);
    }

    public Car(String vinNumber, String make, String model, String mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
