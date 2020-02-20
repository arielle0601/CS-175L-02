import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscountVersion2 {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		boolean loop = true;
	
		while (loop == true) {
			
			System.out.println(" ");
			System.out.println("Please enter the cost of your groceries or '0' to quit: ");
			double cost = kb.nextDouble();
			
			//Main Loop
			if (cost > 0 && cost < 10) {
				System.out.println("You are not eligible for a coupon this time.");
			} else if (cost >= 10 && cost <= 60) {
				double coupon = cost*0.08;
				String num = df.format(coupon);
				System.out.println("You win a discount coupon of $" + num + ". (8% of your purchase)");
			} else if (cost > 60 && cost <= 150) {
				double coupon = cost*0.10;
				String num = df.format(coupon);
				System.out.println("You win a discount coupon of $" + num + ". (10% of your purchase)");
			} else if (cost > 150 && cost < 210) {
				double coupon = cost*0.12;
				String num = df.format(coupon);
				System.out.println("You win a discount coupon of $" + num + ". (12% of your purchase)");
			} else if (cost >= 210 && cost < 1000) {
				double coupon = cost*0.14;
				String num = df.format(coupon);
				System.out.println("You win a discount coupon of $" + num + ". (14% of your purchase)");
			} 
			//Making sure they put in the right input
			else if ( (cost > 0 && cost < 10) || (cost > 1000) || (cost < 0)) {
				System.out.println("invalid input");
			} else if (cost == 0) {
				loop = false;
				System.out.println("You quit :(");
			} else {
				System.out.println("invalid input");
			}
			
		}

	}

}
