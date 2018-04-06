package vehicles;

public class Jeep extends LandVehicle implements Motorized, Commercial{
    private int kml;
    private int lifeTime;
    private CommercialType commercialType;

    public Jeep(int mileage, String maker, String model, int maxPassengers, int maxSpeed, int numOfWheels, Passability landType, int kml, int lifeTime, CommercialType commercialType){
        super(mileage, maker, model, maxPassengers, maxSpeed, numOfWheels, landType);
        this.kml = kml;
        this.lifeTime = lifeTime;
        this.commercialType = commercialType;
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

    @Override
    public CommercialType getCommercialType(){
        return commercialType;
    }

    @Override
    public String toString(){
        return "Jeep: "+super.toString()+", fuel consumption: "+this.kml+", lifetime: "+this.lifeTime+", commercial type: "+this.commercialType;
    }
}