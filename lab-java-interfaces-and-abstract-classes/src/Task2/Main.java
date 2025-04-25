package Task2;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("123","1923","Santana","100000");
        sedan.getInfo();
        UtilityVehicle utility = new UtilityVehicle("124","1234","F1000","100",true);
        utility.getInfo();
        Truck truck = new Truck("123123","1950","Trucking","12030213",1200.0);
        truck.getInfo();
    }
}
