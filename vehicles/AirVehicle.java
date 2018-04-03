package vehicles;

public abstract class AirVehicle extends Vehicle{
	AirVehicleType inUse;

	public AirVehicle(int mileage, String maker, String model, int maxPassengers, int maxSpeed, AirVehicleType inUse){
	    super(mileage, maker, model, maxPassengers, maxSpeed);
        this.inUse = inUse;
    }

	public void SetInUse(AirVehicleType inUse){
		this.inUse = inUse;
	}
	public AirVehicleType GetMilitary(){
		return inUse;
	}
}