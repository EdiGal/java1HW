import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import vehicles.*;
import javax.swing.JOptionPane;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static void main(String[] args) {

        int opt;
        Object[] opts = {"Manager", "Customer", "Exit"};
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
        }while(opt != 2);
    }

    public static void showCustomerDialog(){
        int opt;
        Object[] opts = {"Buy a car", "..", "Back"};
        do{
            opt = JOptionPane.showOptionDialog(null, "what you want to do?", "Car Place", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opts, opts[0]);
            if(opt == 0){
                BuyVehicle();
            }
            else if (opt == 1) {
            }
            else if (opt == 2) {
            }
        }while(opt != 2);
    }

    public static void BuyVehicle(){
        String maker = JOptionPane.showInputDialog(null, "Enter a Maker of car you want to buy","Buy a Car", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Enter a Model of car you want to buy","Buy a Car", JOptionPane.INFORMATION_MESSAGE);
        int index = -1;
        int i = 0;
        for(Vehicle vehicle : vehicles){
            if(vehicle.GetMaker().equals(maker) && vehicle.GetModel().equals(model)){
                index = i;
                break;
            }
            i++;
        }
        if(index > vehicles.size() || index < 0){
            JOptionPane.showMessageDialog(null, "Car not matched");
        }
        else {
            //TODO: remove
            vehicles.remove(index);
            JOptionPane.showMessageDialog(null, "OK");
        }
    }

    public static void addVehicles(){
        int userInput;
        Object[] opts = {"jeep", "frigate", "downspy", "downplay", "print", "Back"};
        do{
            userInput = JOptionPane.showOptionDialog(null, "What vehicle you want to create?", "Car Place", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opts, opts[0]);

            if (userInput == 0) {
                addJeep();
            }

            else if (userInput == 1) {
                addFrigate();
            }
            else if (userInput == 2) {
                addDownSpy();
            }
            else if(userInput == 3){
                addDownPlay();
            }
            else if(userInput == 4){
                printVehicles();
            }
        }while(userInput != 5);
    }

    public static int getKml() {
        String kmlInput = JOptionPane.showInputDialog(null, "Enter fuel consumption(integer)","KML", JOptionPane.INFORMATION_MESSAGE);
        int kml = Integer.parseInt(kmlInput);
        return kml;
    }

    public static int getLifeTime() {
        String lifeTimeInput = JOptionPane.showInputDialog(null, "Enter life time (in year)","Life Time", JOptionPane.INFORMATION_MESSAGE);
        int lifeTime = Integer.parseInt(lifeTimeInput);
        return lifeTime;
    }

    private static void addJeep(){
        String maker = JOptionPane.showInputDialog(null, "Maker","Jeep insert", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Model","Jeep insert", JOptionPane.INFORMATION_MESSAGE);
        int kml = getKml();
        int lifeTime = getLifeTime();
        Jeep jeep = new Jeep(0,maker, model, 5, 180, 4, Passability.DIRT, kml, lifeTime, CommercialType.MINI);
        vehicles.add(jeep);
        JOptionPane.showMessageDialog(null, "Jeep was created");
    }

    private static void addDownSpy(){
        String powerSource = JOptionPane.showInputDialog(null, "Enter power source","DownSpy", JOptionPane.INFORMATION_MESSAGE);
        int kml = getKml();
        DownSpy downSpy = new DownSpy(kml, powerSource);
        vehicles.add(downSpy);
        JOptionPane.showMessageDialog(null, "DownSpy was created");
    }

    private static void addDownPlay(){
        DownPlay downPlay = new DownPlay();
        vehicles.add(downPlay);
        JOptionPane.showMessageDialog(null, "Down-play toi was created");
    }

    private static void addFrigate(){
        String maker = JOptionPane.showInputDialog(null, "Enter maker","Frigate insert", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Enter model","Frigate insert", JOptionPane.INFORMATION_MESSAGE);
        String maxPass = JOptionPane.showInputDialog(null, "Enter max passengers(integer)","Frigate insert", JOptionPane.INFORMATION_MESSAGE);
        int maxPassengers = Integer.parseInt(maxPass);
        String _maxSpeed = JOptionPane.showInputDialog(null, "Enter max speed(integer)","Frigate insert", JOptionPane.INFORMATION_MESSAGE);
        int maxSpeed = Integer.parseInt(_maxSpeed);
        Frigate frigate = new Frigate(maker, model, maxPassengers, maxSpeed, true);
        vehicles.add(frigate);
        JOptionPane.showMessageDialog(null, "Frigate was created");
    }

    public static void printVehicles(){
        int index = 1;
        for(Vehicle vehicle : vehicles){
            System.out.println((index++)+") "+vehicle.toString());
        }
        JOptionPane.showMessageDialog(null, "Was printed into log");
    }
}