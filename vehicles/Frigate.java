package vehicles;

public class Frigate extends MarineVehicle implements Motorized{
    private int kml;
    private int lifetime;

    public Frigate(int mileage, String maker, String model, int maxPassengers, int maxSpeed, boolean withWindDirection){
        super(mileage, maker, model, maxPassengers, maxSpeed, withWindDirection, "Israel");
        this.kml = 500;
        this.lifetime = 4;
    }

    @Override
    int GetFuelConsumption(){
        return kml;
    }

    @Override
    void SetFuelConsumption(int fuelConsumption){
        this.kml = fuelConsumption;
    }

    @Override
    int GetLifetime(){
        return lifetime;
    }
}
