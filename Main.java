import java.lang.String;
import vehicles.*;

public class Main{
	public static void main(String[] args){
		System.out.println("Hi");
        int kml_userInput = 10;
        int lifeTime_userInput = 350000;

        Jeep jeep = new Jeep(0, "KIA Sportage", 5, 180, 4, "afar", kml_userInput, lifeTime_userInput);

        System.out.println("the nml is "+jeep.GetFuelConsumption());

	}
}