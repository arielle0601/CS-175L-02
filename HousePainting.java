import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {

		//House
		Scanner input = new Scanner (System.in);
		System.out.println("Welcome to the House Painting Price Calculator!");
		System.out.println("Enter the length of the house in feet: ");
		int houseLength = input.nextInt();
		System.out.println("Enter the width of the house in feet: ");
		int houseWidth = input.nextInt();
		System.out.println("Enter the height of the house in feet: ");
		int houseHeight = input.nextInt();
		
		//Windows
		System.out.println("Enter the number of windows: ");
		int numWindows = input.nextInt();
		System.out.println("Enter the length of one window in feet: ");
		int windowLength = input.nextInt();
		System.out.println("Enter the width of one window in feet: ");
		int windowWidth = input.nextInt();
		int windowArea = windowLength * windowWidth;
		System.out.println("The area of one window is: " + windowArea);
		
		//Doors
		System.out.println("Enter the number of doors: ");
		int numDoors = input.nextInt();
		System.out.println("Enter the length of one door in feet: ");
		int doorLength = input.nextInt();
		System.out.println("Enter the width of one door in feet: ");
		int doorWidth = input.nextInt();
		int doorArea = doorLength * doorWidth;
		System.out.println("The area of one door is: " + doorArea);
		
		System.out.println("Enter the painter's cost per square foot: ");
		int costPerSqFt = input.nextInt();
	
		//Calculations
		//House
		int peakSideSqFt = 2*(houseLength * houseWidth + (houseLength*(houseHeight - houseWidth))/2);
		int normalSideSqFt = 2*(houseLength * houseWidth);
		int totalHouse = peakSideSqFt + normalSideSqFt;
		
		//Windows and Doors
		int totalWindow = windowArea * numWindows;
		int totalDoor = doorArea * numDoors;
		
		//Totals
		int total = totalHouse - (totalWindow + totalDoor);
		int totalCost = total * costPerSqFt;

		//Output
		System.out.println("Your total cost estimate is $" + totalCost);
		
	}

}
