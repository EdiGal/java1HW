package vehicles;

public abstract class AirVehicle extends Vehicle{
	boolean isMilitary;
	AirVehicleType type;

	public AirVehicle(int mileage, String maker, String model, int maxPassengers, int maxSpeed, AirVehicleType type){
	    super(mileage, maker, model, maxPassengers, maxSpeed);
        this.type = type;
    }

	public void SetMilitary(boolean isMilitary){
		this.isMilitary = isMilitary;
	}
	public void GetMilitary(boolean isMilitary){
		return isMilitary;
	}
}