import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scanner.nextInt();
		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int column = 0; column < n; column++) {

            for (int row = 0; row < n; row++) {
                System.out.printf("%1d ", (int)(Math.random() * 4));
            }
            System.out.println("");
        }
	}
}