
public class CounterTester {

	public static void main(String[] args) {
		
	/** Creates counter called venue */
		
		Counter venue = new Counter();
		
	/** Click 10 times */
		
		for (int i = 1; i <= 10; i ++) {
			venue.click();
		}

	/** Unclick 5 times */
		
		for (int i = 1; i <= 5; i ++) {
			venue.unclick();
		}
		
	/** Print expected value (5) 
	 * and print actual value */
		
		int actualValue = venue.getValue();
		System.out.println("Expected counter value: 5");
		System.out.println("Actual counter value: " +  actualValue);
	
	/** Reset counter */
		
		venue.reset();

	/** Click 3 times */
		
		for (int i = 1; i <= 3; i ++) {
			venue.click();
		}
	
	/** Unclick 4 times */
		
		for (int i = 1; i <= 4; i ++) {
			venue.unclick();
		}
	
	/** Print expected value (-1) 
	 * and print actual value */

		actualValue = venue.getValue();
		System.out.println("Expected counter value: -1");
		System.out.println("Actual counter value: " +  actualValue);
		
	}

}
