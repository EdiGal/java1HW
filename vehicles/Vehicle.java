package vehicles;

import java.lang.String;

public abstract class Vehicle{
	boolean motorized;
	int mileage;

    public Vehicle(boolean motorized, int mileage){
        this.motorized = motorized;
        this.mileage = mileage;
    }

	public Vehicle(boolean motorized){
        this(motorized, 0);
    }

	abstract int Drive(int kmToDrive);
	abstract String GetModel();
	abstract String GetMileage();
	abstract int GetMaxPassengers();
	abstract int GetMaxSpeed();
}