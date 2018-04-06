package vehicles;

public class DownPlay extends AirVehicle implements NotMotorized {
    private static int _count = 0;
    public int count;
    EnergyRating energyRating;
    String powerSource;

    public DownPlay() {
        super(0, "Toysrus", "Toy", 0, 10, AirVehicleType.CIVILIAN);
        this.energyRating = EnergyRating.A;
        this.powerSource = "Manual";
        DownPlay._count++;
        this.count = DownPlay._count;
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
        return "toy #"+this.count + ": " + super.toString()+", energyRating: "+this.energyRating+", powerSource: "+this.powerSource;
    }
}