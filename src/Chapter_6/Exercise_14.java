public class Exercise_14 {
	public static void main(String[] args) {
		System.out.printf("%1s%20s\n", "i", "m(i)");
		System.out.println("________________________");

		for(int i=1; i<=901; i+=100){
			System.out.printf("%-3s%20.4f\n", i, EstimateP(i));
		}
	}
	public static double EstimateP(int number){
		double sum = 0;
		for(double i=1; i<=number; i++){
			sum += 4*((Math.pow((-1), (i+1)))/(2*i-1));
		}
		return sum;
	}
}