
import java.util.Scanner;

public class CarDecisionVersion2Split {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//Regular Car
		System.out.println("Enter the regular car information: ");
		String ar = kb.nextLine();
		
		String array1[]= ar.split(",");
		for (String temp: array1){
		      System.out.println(temp);
		}
		
		String modelRegular = array1[0];
		double costRegular = Double.parseDouble(array1[1]);
		double mpgRegular = Double.parseDouble(array1[2]);
		
		//Hybrid Car
		System.out.println("Enter the hybrid car information: ");
		String ah = kb.nextLine();
		
		String array2[]= ah.split(",");
		for (String temp: array2){
		      System.out.println(temp);
		}
		
		String modelHybrid = array2[0];
		double costHybrid = Double.parseDouble(array2[1]);
		double mpgHybrid = Double.parseDouble(array2[2]);
		
		//Other info
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
