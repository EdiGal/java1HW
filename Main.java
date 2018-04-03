import java.lang.String;
import java.util.Scanner;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vehicleType;

        do{
            System.out.print("What vehicle you want to create? (help)");
            vehicleType = sc.next();
            vehicleType = vehicleType.toLowerCase();

            if (vehicleType.equals("jeep")) {
                System.out.println("Let's add a jeep");

                System.out.println("enter maker");
                String maker = sc.next();

                System.out.println("enter model");
                String model = sc.next();

                int kml = getKml();
                int lifeTime = getLifeTime();
                Jeep jeep = new Jeep(0,maker, model, 5, 180, 4, Passability.DIRT, kml, lifeTime, CommercialType.MINI);
            }

            else if (vehicleType.equals("downspy")) {

                String powerSource;
                System.out.println("enter power source");
                String powerSource = sc.next();

                int kml = getKml();
                DownSpy downSpy = new DownSpy(kml, powerSource);
            }

            else if(vehicleType.equals("help")){ System.out.println("jeep, downspy"); }

            else if(vehicleType.equals("exit")){ }

            else { System.out.println("no vehicle matched"); }

        }while(!vehicleType.equals("exit"));
    }

    public static int getKml() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kml");
        String kmlInput = sc.next();
        int kml = Integer.parseInt(kmlInput);
        return kml;
    }

    public static int getLifeTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lifetime");
        String lifeTimeInput = sc.next();
        int lifeTime = Integer.parseInt(lifeTimeInput);
        return lifeTime;
    }
}