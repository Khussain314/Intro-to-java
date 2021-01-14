public class Exercise_09 {
	public static void main(String[] args) {
		
		System.out.printf("%1s%20s%10s%19s%20s\n", "Feet", "Meters", "|", "Meters", "Feet");
		System.out.println("__________________________________________________________________________");

		for(double foot = 1, meter = 20; foot<=10; foot++, meter+=5){
			System.out.printf("%-7s%20.3f%10s%19s%20.f\n", foot, footToMeter(foot), "|", meter, meterToFoot(meter));
		}
	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}