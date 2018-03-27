package vehicles;

import java.lang.String;

public class PrivateCar extends LandVehicle {
    private String color;

    public PrivateCar(boolean motorized, int numOfWheels, String landType, String color){
        super(motorized, numOfWheels, landType);
        this.color = color;
    }
}