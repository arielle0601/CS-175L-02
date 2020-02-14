
import java.util.Scanner;

public class CarDecisionVersion2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//Regular Car
		System.out.println("Enter the regular car information: ");
		String ar = kb.nextLine();
		String modelRegular = ar.substring(0, 14);
		String br = ar.substring(15, 20);
		double costRegular = Double.parseDouble(br);
		String cr = ar.substring(21, 23);
		double mpgRegular = Double.parseDouble(cr);

		//Hybrid Car
		System.out.println("Enter the hybrid car information: ");
		String ah = kb.nextLine();
		String modelHybrid = ah.substring(0, 12);
		String bh = ah.substring(13, 18);
		double costHybrid = Double.parseDouble(bh);
		String ch = ah.substring(19, 21);
		double mpgHybrid = Double.parseDouble(ch);

		System.out.println("Enter miles traveled in a year: ");
		double milesTraveled = kb.nextInt();
		System.out.println("Enter cost per gallon of gas: ");
		double gasCost = kb.nextDouble();
		
		//Regular Calculation
		double totalRegular1 = ((milesTraveled/mpgRegular) * gasCost) + costRegular;
		double totalRegular2 = (2*((milesTraveled/mpgRegular) * gasCost)) + costRegular;
		double totalRegular3 = (3*((milesTraveled/mpgRegular) * gasCost)) + costRegular;
		double totalRegular4 = (4*((milesTraveled/mpgRegular) * gasCost)) + costRegular;
		double totalRegular5 = (5*((milesTraveled/mpgRegular) * gasCost)) + costRegular;
				
		//Hybrid Calculation
		double totalHybrid1 = ((milesTraveled/mpgHybrid) * gasCost) + costHybrid;
		double totalHybrid2 = (2*((milesTraveled/mpgHybrid) * gasCost)) + costHybrid;
		double totalHybrid3 = (3*((milesTraveled/mpgHybrid) * gasCost)) + costHybrid;
		double totalHybrid4 = (4*((milesTraveled/mpgHybrid) * gasCost)) + costHybrid;
		double totalHybrid5 = (5*((milesTraveled/mpgHybrid) * gasCost)) + costHybrid;
		
		//Output
		System.out.println("Cost to own " + modelRegular + " after year 1: " + totalRegular1 
				+ " for " + modelHybrid + ": " + totalHybrid1);
		System.out.println("Cost to own " + modelRegular + " after year 2: " + totalRegular2 
				+ " for " + modelHybrid + ": " + totalHybrid2);
		System.out.println("Cost to own " + modelRegular + " after year 3: " + totalRegular3 
				+ " for " + modelHybrid + ": " + totalHybrid3);
		System.out.println("Cost to own " + modelRegular + " after year 4: " + totalRegular4 
				+ " for " + modelHybrid + ": " + totalHybrid4);
		System.out.println("Cost to own " + modelRegular + " after year 5: " + totalRegular5 
				+ " for " + modelHybrid + ": " + totalHybrid5);
		
		if (totalHybrid5 < totalRegular5) {
			System.out.println("The " + modelHybrid + " pays back after 5 years.");
		}
		else {
			System.out.println("The " + modelRegular + " pays back after 5 years.");
		}	

	}

}
