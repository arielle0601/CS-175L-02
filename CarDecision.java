import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		//Regular Car
		System.out.println("Enter Cost of regular car: ");
		int costRegular = input.nextInt();
		System.out.println("Enter Miles per gallon of regular car: ");
		int mpgRegular = input.nextInt();
		
		//Hybrid Car
		System.out.println("Enter Cost of hybrid car: ");
		int costHybrid = input.nextInt();
		System.out.println("Enter Miles per gallon of hybrid car: ");
		int mpgHybrid = input.nextInt();
		
		//Travel Cost
		System.out.println("Enter miles traveled in a year: ");
		int milesTraveled = input.nextInt();
		System.out.println("Enter cost per gallon of gas: ");
		double gasCost = input.nextDouble();
		
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
		System.out.println("Cost to own after year 1 for regular car: " + totalRegular1 
				+ "for hybrid car: " + totalHybrid1);
		System.out.println("Cost to own after year 2 for regular car: " + totalRegular2 
				+ "for hybrid car: " + totalHybrid2);
		System.out.println("Cost to own after year 3 for regular car: " + totalRegular3 
				+ "for hybrid car: " + totalHybrid3);
		System.out.println("Cost to own after year 4 for regular car: " + totalRegular4 
				+ "for hybrid car: " + totalHybrid4);
		System.out.println("Cost to own after year 5 for regular car: " + totalRegular5 
				+ "for hybrid car: " + totalHybrid5);
		
		if (totalHybrid5 < totalRegular5) {
			System.out.println("The hybrid car pays back after 5 years.");
		}
		else {
			System.out.println("The regular car pays back after 5 years.");
		}
		

	}

}
