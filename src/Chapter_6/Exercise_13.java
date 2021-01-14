public class Exercise_13 {
	public static void main(String[] args) {
		System.out.printf("%1s%20s\n", "i", "m(i)");
		System.out.println("________________________");

		for(int i=1; i<=20; i++){
			System.out.printf("%-2s%20.3f\n", i, sumSeries(i));
		}
	}

	public static double sumSeries(int number){
		double sum = 0;
		for(double i=1; i<=number; i++){
			sum += (i)/(i+1);
		}
		return sum;
	}
}