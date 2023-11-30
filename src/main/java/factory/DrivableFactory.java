package factory;

public class DrivableFactory {



    public static Drivable getVehicle(String name) { // each should bring back a unique object

        switch (name) {
            case "car":
                return new Car();
            case "boat":
                return new Boat();
            case "bus":
                return new Bus();
        }
        return null;

    }
}
