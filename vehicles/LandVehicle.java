package vehicles;

import java.lang.String;

public abstract class LandVehicle extends Vehicle{
    int numOfWheels;
    Passability landType;

    public LandVehicle(int mileage, String maker, String model, int maxPassengers, int maxSpeed, int numOfWheels, Passability landType){
        super(mileage, maker, model, maxPassengers, maxSpeed);
        this.numOfWheels = numOfWheels;
        this.landType = landType;
    }

	public int GetNumOfWheels(){
	    return numOfWheels;
    }

    public Passability GetLandType(){
	    return landType;
    }
}