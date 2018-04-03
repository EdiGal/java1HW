package vehicles;

public class DownSpy extends AirVehicle implements NotMotorized {
    EnergyRating energyRating;
    String powerSource;

    public Glider(int mileage, String powerSource){
        super(mileage, "NA", "NA", 1, 50, AirVehicleType.MILITARY);
        this.energyRating = EnergyRating.C;
        this.powerSource = powerSource;
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