import java.util.*;

public class PlanetDemo {

	public static void main(String[] args) {
		Planet myplanet= Planet.earth;
		
	//	Scanner input= new Scanner(System.in);

		
		System.out.println(myplanet+ " " +myplanet.getDesc()+
				    " It has surface gravity "+ myplanet.surfaceGravity());
	
		
	}

}
