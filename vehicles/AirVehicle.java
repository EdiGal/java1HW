package vehicles;

public abstract class AirVehicle extends Vehicle{
	//TODO: enum type: {military, civilian}
	boolean isMilitary;

	public AirVehicle(int mileage, String model, int maxPassengers, int maxSpeed, boolean isMilitary){
	    super(mileage, model, maxPassengers, maxSpeed);
        this.isMilitary = isMilitary;
    }

	public void SetMilitary(boolean isMilitary){
		this.isMilitary = isMilitary;
	}
	public void GetMilitary(boolean isMilitary){
		return isMilitary;
	}
}