package vehicles;

import java.lang.String;

public abstract class Vehicle{
    private int mileage;
    private String model;
    private int maxPassengers;
    private int maxSpeed;

    public Vehicle(int mileage, String model, int maxPassengers, int maxSpeed){
        this.mileage = mileage;
        this.model = model;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

	public int Drive(int kmToDrive){
        return this.mileage += kmToDrive;
    }

    public int GetMileage(){
        return mileage;
    }

    public String GetModel(){
	    return model;
    }

    public int GetMaxPassengers(){
        return maxPassengers;
    }

    public int GetMaxSpeed(){
        return maxSpeed;
    }
}