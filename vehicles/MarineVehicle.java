package vehicles;

import java.lang.String;

public abstract class MarineVehicle extends Vehicle{
    boolean withWindDirection;
    String country;

    public MarineVehicle(int mileage, String maker, String model, int maxPassengers, int maxSpeed, boolean withWindDirection, String country){
        super(mileage, maker, model, maxPassengers, maxSpeed);
        this.withWindDirection = withWindDirection;
        this.country = country;
    }

    public void SetWithWindDirection(boolean withWindDirection){
        this.withWindDirection = withWindDirection;
    }
    public boolean GetWithWindDirection(){
        return withWindDirection;
    }

    public void SetCountry(String country){
        this.country = country;
    }
    public String GetCountry(){
        return country;
    }

    @Override
    public String toString(){
        return super.toString()+", with wind direction: "+this.withWindDirection+", country: "+this.country;
    }
}