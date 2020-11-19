import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your numbers: ");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		displaySortedNumbers(num1 ,num2, num3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;

		if(num1>num2 && num1>num3){
			n1 = num1;
		}else if (num1>num2 && num1<num3) {
			n2 = num1;
		}else if (num1<num2 && num1>num3) {
			n2 = num1;
		}else if (num1<num2 && num1<num3) {
			n3 = num1;
		}

		if(num2>num1 && num2>num3){
			n1 = num2;
		}else if (num2>num1 && num2<num3) {
			n2 = num2;
		}else if (num2<num1 && num2>num3) {
			n2 = num2;
		}else if (num2<num1 && num2<num3) {
			n3 = num2;
		}

		if(num3>num2 && num3>num1){
			n1 = num3;
		}else if (num3>num2 && num3<num1) {
			n2 = num3;
		}else if (num3<num2 && num3>num1) {
			n2 = num3;
		}else if (num3<num2 && num3<num1) {
			n3 = num3;
		}

		System.out.println(n1 + " " + n2 + " " + n3);
	}
}