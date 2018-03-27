package vehicles;

public abstract class AirVehicle extends Vehicle{
	boolean isMilitary;

	public AirVehicle(boolean motorized, int mileage, String model, boolean isMilitary){
	    super(motorized, mileage, model);
        this.isMilitary = isMilitary;
    }

    public AirVehicle(boolean motorized, boolean isMilitary){
        this(motorized, 0, isMilitary);
    }

	void SetMilitary(boolean isMilitary){
	    this.isMilitary = isMilitary;
	}
}