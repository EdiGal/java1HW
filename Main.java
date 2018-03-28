import java.lang.String;
import vehicles.*;

public class Main{
	public static void main(String[] args){
		System.out.println("Hi");
        PrivateCar privateCar = new PrivateCar(9, "KIA Sportage", 4, "Out Lander", 5, 180);
        System.out.println("Num of wheels: "+privateCar.GetNumOfWheels());
	}
}