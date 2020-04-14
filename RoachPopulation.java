
public class RoachPopulation {
	
	private int population;

		public RoachPopulation(int num) {
			population = num;
		}
	
		public int getRoaches() {
			return population;
		}

		public void breed() {
			population = population * 2;
	    }
	   
		public void spray(int percentage) {
			double decPercent = percentage * 0.01;
			
			int sprayAmount = (int)Math.round(population * decPercent);
			population = population - sprayAmount;
		}

}
