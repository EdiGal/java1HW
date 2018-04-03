import java.lang.String;
import java.util.Scanner;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What vehicle you want to create? ");

        String vehicleType = sc.next();
        vehicleType = vehicleType.toLowerCase();

        if (vehicleType.equals("jeep")) {
            System.out.println("you choose jeep");

            System.out.println("enter maker");
            String maker = sc.next();

            System.out.println("enter model");
            String model = sc.next();

            int kml = getKml();

            int lifeTime = getLifeTime();

            Jeep jeep = new Jeep(0,maker, model, 5, 180, 4, Passability.DIRT, kml, lifeTime, CommercialType.MINI);

        } else {
            System.out.println("no vehicle matched");
        }

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