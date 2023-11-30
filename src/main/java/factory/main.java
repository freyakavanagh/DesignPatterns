package factory;

public class main {

    public static void main(String[] args) {
        Drivable car = DrivableFactory.getVehicle("car"); // will only call methods the interface provides
        Car car2 = new Car(); // can call any methods from interface and car
        car.drive();
        car2.stop();
    }


}
