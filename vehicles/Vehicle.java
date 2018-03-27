package vehicles;

import java.lang.String;

public abstract class Vehicle{
	boolean motorized;
	int mileage;
	String model;

    public Vehicle(boolean motorized, int mileage, String model){
        this.motorized = motorized;
        this.mileage = mileage;
        this.model = model;
    }

	public Vehicle(boolean motorized, String model){
        this(motorized, 0, model);
    }

	public int Drive(int kmToDrive){
        return this.mileage += kmToDrive;
    }

	public String GetModel(){
	    return model;
    }

	public int GetMileage(){
        return mileage;
    }

	abstract int GetMaxPassengers();
	abstract int GetMaxSpeed();
}