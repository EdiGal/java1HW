package vehicles;

import java.lang.String;

public abstract class LandVehicle extends Vehicle{
    int numOfWheels;
    String landType;

    public LandVehicle(boolean motorized, int mileage, String model, int numOfWheels, String landType){
        super(motorized, mileage, model);
        this.numOfWheels = numOfWheels;
        this.landType = landType;
    }

    public LandVehicle(boolean motorized, String model, int numOfWheels, String landType){
        this(motorized, 0, model, numOfWheels, landType);
    }

	public int GetNumOfWheels(){
	    return numOfWheels;
    }

    public String GetLandType(){
	    return landType;
    }
}