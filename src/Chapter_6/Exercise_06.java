import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter you number: ");
		int n = scanner.nextInt();
		displayPattern(n);
	}

	public static void displayPattern(int n) {

		for(int i=1; i<n; i++){
			
			for(int k=0; k<n-i; k++){
				System.out.printf("%4s", "");
			}

			
			for(int j=1; j<=i; j++){
				System.out.printf("%4d",j);
			}
			
			System.out.println();
		}
	}
}

