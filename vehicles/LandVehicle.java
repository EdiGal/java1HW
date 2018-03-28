package vehicles;

import java.lang.String;

public abstract class LandVehicle extends Vehicle{
    int numOfWheels;
    //TODO: enum type: {paved, dirt}
    String landType;

    public LandVehicle(int mileage, String model, int maxPassengers, int maxSpeed, int numOfWheels, String landType){
        super(mileage, model, maxPassengers, maxSpeed);
        this.numOfWheels = numOfWheels;
        this.landType = landType;
    }

	public int GetNumOfWheels(){
	    return numOfWheels;
    }

    public String GetLandType(){
	    return landType;
    }
}