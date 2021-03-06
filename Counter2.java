/** This class models a tally counter. */

public class Counter2 {
   
	private int value;

   /** Gets the current value of this counter.
    *  @return the current value */
  
	public int getValue() {
		return value;
	}

   /**  Advances the value of this counter by 1. */
   
	public void click() {
	   value = value + 1;
    }
   /** Decreases the value of this counter by 1. */

	public void unclick() {
	   value = value -1;
	}
	
	public void clickMany(int num) {
		value = value + num;
	}
	
	public void unclickMany(int num) {
		value = value - num;
	}

   /** Resets the value of this counter to 0. */
   
	public void reset() {
	   value = 0;
	}
}