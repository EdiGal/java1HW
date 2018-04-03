package vehicles;

public class DownSpy extends AirVehicle implements NotMotorized {
    EnergyRating energyRating;
    String powerSource;

    public Glider(int mileage, String maker, String model, int maxPassengers, int maxSpeed, AirVehicleType type, EnergyRating energyRating, String powerSource){
        super(mileage, maker, model, maxPassengers, maxSpeed, AirVehicleType.MILITARY);
    }

    @Override
    string GetPowerSource(){
        return powerSource;
    }

    @Override
    EnergyRating GetEnergyRating(){
        return energyRating;
    }
}