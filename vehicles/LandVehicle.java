package vehicles;

import java.lang.String;

public abstract class LandVehicle extends Vehicle{
    int numOfWheels;
    String landType;

    public LandVehicle(boolean motorized, int mileage, int numOfWheels, String landType){
        super(motorized, mileage);
        this.numOfWheels = numOfWheels;
        this.landType = landType;
    }

    public LandVehicle(boolean motorized, int numOfWheels, String landType){
        this(motorized, 0, numOfWheels, landType);
    }

	int GetNumOfWheels(){
	    return numOfWheels;
    }

    void GetLandType(){
	    return landType;
    }
}