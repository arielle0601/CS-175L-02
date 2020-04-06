
public class CounterTester2 {
	
	public static void main(String[] args) {
		
		/** Creates counter called anotherVenue */
			
			Counter2 anotherVenue = new Counter2();
			
		/** clickMany 10 times */
			
			anotherVenue.clickMany(10);


		/** unclickMany 5 times */
			
			anotherVenue.unclickMany(5);
			
		/** Print expected value (5) 
		 * and print actual value */
			
			System.out.println("Expected venue: 5");
			System.out.println("Actual venue: " +  anotherVenue.getValue());
		
		/** Reset counter */
			
			anotherVenue.reset();

		/** clickMany 3 times */
			
			anotherVenue.clickMany(3);
		
		/** unclickMany 4 times */
			
			anotherVenue.unclickMany(4);
		
		/** Print expected value (-1) 
		 * and print actual value */

			System.out.println("Expected venue: -1");
			System.out.println("Actual venue: " +  anotherVenue.getValue());
			
		}

	}
