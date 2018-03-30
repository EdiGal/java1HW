package vehicles;

//TODO: implement motorized
public class Jeep extends LandVehicle implements Motorized{
    private int kml;
    private int lifeTime;

    public Jeep(int mileage, String model, int maxPassengers, int maxSpeed, int numOfWheels, String landType, int kml, int lifeTime){
        super(mileage, model, maxPassengers, maxSpeed, numOfWheels, landType);
        this.kml = kml;
        this.lifeTime = lifeTime;
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
        return lifeTime;
    }

}