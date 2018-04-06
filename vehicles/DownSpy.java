package vehicles;

public class DownSpy extends AirVehicle implements NotMotorized {
    EnergyRating energyRating;
    String powerSource;

    public DownSpy(int mileage, String powerSource){
        super(mileage, "NA", "NA", 1, 50, AirVehicleType.MILITARY);
        this.energyRating = EnergyRating.C;
        this.powerSource = powerSource;
    }

    @Override
    public String GetPowerSource(){
        return powerSource;
    }

    @Override
    public EnergyRating GetEnergyRating(){
        return energyRating;
    }

    @Override
    public String toString(){
        return super.toString()+", energyRating: "+this.energyRating+", powerSource: "+this.powerSource;
    }
}