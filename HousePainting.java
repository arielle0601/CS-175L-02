import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
	
		/* Input a number from the user, save as houseWidth
		Input a second number from the user, save as houseLength
		Input a third number from the user, save as houseHeight
		Input a fourth number from the user, save as numWindows
		Input a fifth number from the user, save as windowDimension
		Input a sixth number from the user, save as numDoors
		Input a seventh number from the user, save as doorDimension
		Input an eighth number from the user, save as costPerSqFt */
		
		//User Input
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to the House Painting Price Calculator!");
		System.out.println("Enter the width of the house in feet rounded to the nearest whole number: ");
		int houseWidth = input.nextInt();
		System.out.println("Enter the length of the house in feet rounded to the nearest whole number: ");
		int houseLength = input.nextInt();
		System.out.println("Enter the height of the house in feet rounded to the nearest whole number: ");
		int houseHeight = input.nextInt();
		System.out.println("Enter the number of windows: ");
		int numWindows = input.nextInt();
		System.out.println("Enter the area of one window in square feet rounded to the nearest whole number: ");
		int windowDimension = input.nextInt();
		System.out.println("Enter the number of doors: ");
		int numDoors = input.nextInt();
		System.out.println("Enter the area of one door in square feet rounded to the nearest whole number: ");
		int doorDimension = input.nextInt();
		System.out.println("Enter the painter's cost per square foot rounded to the nearest whole number: ");
		int costPerSqFt = input.nextInt();
		
		/* Multiply houseLength by houseWidth and add the product to one half of 
		 * houseLength times the difference of houseHeight minus houseWidth. 
		 * Save this value as peakSideSqFt.
		Multiply houseLength by houseWidth and save this value as normalSideSqFt.
		Add peakSideSqFt and normalSideSqFt and save as totalHouse.
		Multiply windowDimension by numWindows and save as totalWindow.
		Multiply doorDimension by numDoors and save as totalDoor.
		Add totalWindow and totalDoor and subtract the sum from totalHouse. Save as total.
		Multiply total by costPerSqFt and save as totalCost. */
		
		//Calculations
		int peakSideSqFt = houseLength * houseWidth + (houseLength*(houseHeight - houseWidth))/2;
		int normalSideSqFt = houseLength * houseWidth;
		int totalHouse = peakSideSqFt + normalSideSqFt;
		int totalWindow = windowDimension * numWindows;
		int totalDoor = doorDimension * numDoors;
		int total = totalHouse - (totalWindow + totalDoor);
		int totalCost = total * costPerSqFt;
		
		//Output the phrase Your total cost estimate is $ followed by totalCost.
		
		//Output
		System.out.println("Your total cost estimate is $" + totalCost);
		
		
 
	}

}

