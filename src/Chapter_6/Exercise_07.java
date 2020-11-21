import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double investmentAmount = scanner.nextDouble();

		System.out.print("Annual interest rate: ");
		double monthlyInterestRate = scanner.nextDouble() / 100 / 12;

		System.out.print("Years: ");
		int years = scanner.nextInt();

		double futurevalue = 0;

		System.out.printf("%3s%20s\n", "Years", "Future Value");
		for(int i=0; i<=years; i++){
			
			System.out.printf("%-4d%20.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
			
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		
		return investmentAmount *  Math.pow((1 + monthlyInterestRate), (years * 12));
	}
}	


/*
investmentAmount + ((monthlyInterestRate * investmentAmount/12) 12 * years);
*/