package vehicles;

import java.lang.String;

public class PrivateCar extends LandVehicle {

    public PrivateCar(int mileage, String model, int numOfWheels, String landType, int maxPassengers, int maxSpeed){
        super(mileage, model, numOfWheels, landType);
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }


}