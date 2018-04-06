import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import vehicles.*;
import javax.swing.JOptionPane;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static void main(String[] args) {

        int opt;
        Object[] opts = {"Manager", "Customer", "CANCEl"};
        do{
            opt = JOptionPane.showOptionDialog(null, "what you want to do?", "Car Place", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opts, opts[0]);
            if(opt == 0){
                addVehicles();
            }
            else if (opt == 1) {
                showCustomerDialog();
            }
            else if (opt == 2) {
                System.out.println("bye bye!");
            }
        }while(opt == 2);

    }

    public static void showCustomerDialog(){

    }

    public static void addVehicles(){
        String userInput;
        do{
            System.out.print("What vehicle you want to create? (help)");
            userInput = sc.next();
            userInput = userInput.toLowerCase();

            if (userInput.equals("jeep")) {
                addJeep();
            }

            else if (userInput.equals("frigate")) {
                addFrigate();
            }
            else if (userInput.equals("downspy")) {
                addDownSpy();
            }
            else if(userInput.equals("downplay")){
                addDownPlay();
            }
            else if(userInput.equals("print")){
                printVehicles();
            }
            else if(userInput.equals("help")){ System.out.println("print, jeep, downspy, downplay"); }
            else if(userInput.equals("exit")){ System.out.println("bye bye!"); }
            else { System.out.println("no vehicle matched"); }

        }while(!userInput.equals("exit"));
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

    private static void addJeep(){
        System.out.println("Let's add a Jeep");
        System.out.println("enter maker");
        String maker = sc.next();
        System.out.println("enter model");
        String model = sc.next();
        int kml = getKml();
        int lifeTime = getLifeTime();
        Jeep jeep = new Jeep(0,maker, model, 5, 180, 4, Passability.DIRT, kml, lifeTime, CommercialType.MINI);
        vehicles.add(jeep);
    }

    private static void addDownSpy(){
        System.out.println("Let's add a DownSpy");
        System.out.println("enter power source");
        String powerSource = sc.next();
        int kml = getKml();
        DownSpy downSpy = new DownSpy(kml, powerSource);
        vehicles.add(downSpy);
    }

    private static void addDownPlay(){
        System.out.println("Let's add a DownPlay");
        DownPlay downPlay = new DownPlay();
        vehicles.add(downPlay);
    }

    private static void addFrigate(){
        System.out.println("Let's add a Frigate");
        System.out.println("enter maker");
        String maker = sc.next();
        System.out.println("enter model");
        String model = sc.next();
        System.out.println("enter max passengers");
        String maxPass = sc.next();
        int maxPassengers = Integer.parseInt(maxPass);

        System.out.println("enter max speed");
        String _maxSpeed = sc.next();
        int maxSpeed = Integer.parseInt(_maxSpeed);

        Frigate frigate = new Frigate(maker, model, maxPassengers, maxSpeed, true);
        vehicles.add(frigate);
    }

    public static void printVehicles(){
        int index = 1;
        for(Vehicle vehicle : vehicles){
            System.out.println((index++)+") "+vehicle.toString());
        }
    }
}