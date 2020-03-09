import java.util.Scanner;

public class HeatIndex {
	
	public static void main(String[] args) {
		
	// STEP ONE
		
		System.out.println("                                       NOAA's National Weather Service");
		System.out.println("                                                  Heat Index");
		System.out.println("");
		System.out.println("Relative                                       Temperature (F)");
		System.out.println("Humidity");
		System.out.println("  (%)");
		System.out.printf("       ");
		
		//Temperature
		for (int x = 80; x <= 110; x += 2){
			System.out.printf("%6d", x);
		}
		System.out.println();
		System.out.println("_______________________________________________________________________________________________________");
		
		//Relative Humidity
		for (int RH = 40; RH <= 100; RH += 5) {
			System.out.printf("%3d  | ", RH);
			
			//Heat Index
			for (int T = 80; T <= 110; T+=2) {
				//Calculation
				double roundedCalc = Math.round(-42.379 + 2.04901523*T + 10.14333127*RH 
						- .22475541*T*RH - .00683783*T*T - .05481717*RH*RH 
						+ .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH);
				int calculation = (int)roundedCalc;
				String calc = "";
				
				if (calculation <= 137) {
					calc = Integer.toString(calculation);
				} else {
					calc = " ";
				}
				System.out.printf("%6s",(calc)); 
			}
			System.out.println(); 
		} // End of Step 1
		
		
	//STEP 2
		
		Scanner kb = new Scanner (System.in);
		
		boolean loop = true;
		
		while (loop == true) {
			
			System.out.println();
			System.out.println("Enter the temperature or 0 to end: ");
			int temp = kb.nextInt();
				if (temp == 0) {
					System.out.println("You quit");
					break;
				}
			
			System.out.println("Enter the relative humidity: ");
			int rh = kb.nextInt();
			
			//calculation
			double roundedCalc = Math.round(-42.379 + 2.04901523*temp + 10.14333127*rh 
					- .22475541*temp*rh - .00683783*temp*temp - .05481717*rh*rh 
					+ .00122874*temp*temp*rh + .00085282*temp*rh*rh - .00000199*temp*temp*rh*rh);
			int thi = (int)roundedCalc;

			//advisory
			if (thi <= 90) {
				System.out.println("Temperature: " + temp);
				System.out.println("RH: " + rh + "%");
				System.out.println("THI: " + thi);
				System.out.println("Advisory: Caution");
			} else if (thi < 105) {
				System.out.println("Temperature: " + temp);
				System.out.println("RH: " + rh + "%");
				System.out.println("THI: " + thi);
				System.out.println("Advisory: Extreme Caution");
			} else if (thi < 126) {
				System.out.println("Temperature: " + temp);
				System.out.println("RH: " + rh + "%");
				System.out.println("THI: " + thi);
				System.out.println("Advisory: Danger");
			} else {
				System.out.println("Temperature: " + temp);
				System.out.println("RH: " + rh + "%");
				System.out.println("THI: " + thi);
				System.out.println("Advisory: Extreme Danger");
			}
			
		} // loop

	} // main

}
