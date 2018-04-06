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
        Object[] opts = {"Buy a car", "Test Drive", "Back"};
        do{
            opt = JOptionPane.showOptionDialog(null, "what you want to do?", "Car Place", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opts, opts[0]);
            if(opt == 0){
                BuyVehicle();
            }
            else if (opt == 1) {
                makeTestDrive();
            }
            else if (opt == 2) {
            }
        }while(opt != 2);
    }

    public static int getVehicleIndexByMakerAndModel(String maker, String model){
        int index = -1;
        int i = 0;
        for(Vehicle vehicle : vehicles){
            if(vehicle.GetMaker().equals(maker) && vehicle.GetModel().equals(model)){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }

    public static void BuyVehicle(){
        printVehicles();
        String maker = JOptionPane.showInputDialog(null, "Enter a Maker of car you want to buy","Buy a Car", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Enter a Model of car you want to buy","Buy a Car", JOptionPane.INFORMATION_MESSAGE);
        int index = getVehicleIndexByMakerAndModel(maker, model);
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Car not matched");
        }
        else {
            vehicles.remove(index);
            JOptionPane.showMessageDialog(null, "OK");
        }
    }

    public static void makeTestDrive(){
        printVehicles();
        String maker = JOptionPane.showInputDialog(null, "Enter a Maker of car you want to buy","Test Drive", JOptionPane.INFORMATION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Enter a Model of car you want to buy","Test Drive", JOptionPane.INFORMATION_MESSAGE);
        String _km = JOptionPane.showInputDialog(null, "Enter a km for test drive","Test Drive", JOptionPane.INFORMATION_MESSAGE);
        int km;
        try{
            km = Integer.parseInt(_km);
        }
        catch (NumberFormatException e){
            km = 0;
        }
        int index = getVehicleIndexByMakerAndModel(maker, model);
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Car not matched");
        }
        else {
            vehicles.get(index).Drive(km);
            JOptionPane.showMessageDialog(null, "OK");
        }
    }

    public static void addVehicles(){
        int userInput;
        Object[] opts = {"Jeep", "Frigate", "DownSpy", "DownPlay", "Print", "Milaage Reset", "Set county to all marine", "Back"};
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
            else if(userInput == 5){
                resetMilage();
            }
            else if(userInput == 6){
                SetCountryForAllMarineVehicles();
            }
        }while(userInput != 7);
    }

    public static void resetMilage(){
        for(Vehicle vehicle : vehicles){
            vehicle.ResetMilage();
        }
    }

    public static void SetCountryForAllMarineVehicles(){
        String country = JOptionPane.showInputDialog(null, "Enter a country for all marine vehicles","Change Country", JOptionPane.INFORMATION_MESSAGE);
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof MarineVehicle){
                ((MarineVehicle)vehicle).SetCountry(country);
            }
        }
    }


    public static int getKml() {
        String kmlInput = JOptionPane.showInputDialog(null, "Enter fuel consumption(integer)","KML", JOptionPane.INFORMATION_MESSAGE);
        int kml;
        try{
            kml = Integer.parseInt(kmlInput);
        }
        catch (NumberFormatException e){
            kml = 0;
        }
        return kml;
    }

    public static int getLifeTime() {
        String lifeTimeInput = JOptionPane.showInputDialog(null, "Enter life time (in year)","Life Time", JOptionPane.INFORMATION_MESSAGE);
        int lifeTime;
        try{
            lifeTime = Integer.parseInt(lifeTimeInput);
        }
        catch (NumberFormatException e){
            lifeTime = 0;
        }
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
        int maxPassengers;
        try{
            maxPassengers = Integer.parseInt(maxPass);
        }
        catch (NumberFormatException e){
            maxPassengers = 0;
        }

        String _maxSpeed = JOptionPane.showInputDialog(null, "Enter max speed(integer)","Frigate insert", JOptionPane.INFORMATION_MESSAGE);
        int maxSpeed;
        try{
            maxSpeed = Integer.parseInt(_maxSpeed);
        }
        catch (NumberFormatException e){
            maxSpeed = 0;
        }

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