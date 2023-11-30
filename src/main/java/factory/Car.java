package factory;

public class Car implements Drivable{

    @Override
    public void drive() {
        System.out.println("driving a car");
    }

    public void stop(){
        System.out.println("Stop the car");
    }
}
