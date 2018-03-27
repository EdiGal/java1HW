package vehicles;

import java.lang.String;

public class PrivateCar extends LandVehicle {
    private int maxPassengers;
    private int maxSpeed;

    public PrivateCar(boolean motorized, int mileage, String model, int numOfWheels, String landType, int maxPassengers, int maxSpeed){
        super(motorized, mileage, model, numOfWheels, landType);
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

     @Override
     public int GetMaxPassengers(){
        return maxPassengers;
     }

    @Override
    public int GetMaxSpeed(){
        return maxSpeed;
    }
}