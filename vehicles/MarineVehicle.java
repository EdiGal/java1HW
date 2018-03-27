package vehicles;

import java.lang.String;

public abstract class MarineVehicle extends Vehicle{
    String country;
    boolean withWindDirection;

    public MarineVehicle(boolean motorized, int mileage, String country, boolean withWindDirection){
        super(motorized, mileage);
        this.country = country;
        this.withWindDirection = withWindDirection;
    }

    public MarineVehicle(boolean motorized, int mileage, String country, boolean withWindDirection){
        this(motorized, 0, country, withWindDirection);
    }

    void SetWithWindDirection(boolean withWindDirection){
        this.withWindDirection = withWindDirection;
    }

	void SetCountry(String country){
	    this.country = country;
    }

}