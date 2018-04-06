package vehicles;

public class Frigate extends MarineVehicle implements Motorized{
    private int kml;
    private int lifetime;

    public Frigate(String maker, String model, int maxPassengers, int maxSpeed, boolean withWindDirection){
        super(0, maker, model, maxPassengers, maxSpeed, withWindDirection, "Israel");
        this.kml = 500;
        this.lifetime = 4;
    }

    @Override
    public int GetFuelConsumption(){
        return kml;
    }

    @Override
    public void SetFuelConsumption(int fuelConsumption){
        this.kml = fuelConsumption;
    }

    @Override
    public int GetLifetime(){
        return lifetime;
    }

    @Override
    public String toString(){
        return super.toString()+", fuel consumption: "+this.kml+", lifetime: "+this.lifetime;
    }
}
