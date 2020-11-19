/*
*Chapter 6 Exercise 3:
*
*	(Display an integer reversed) Write a method with the following header to display
*	an integer in reverse order:
*
*	public static void reverse(int number)
*
*	For example, reverse(3456) displays 6543. Write a test program that prompts
*	the user to enter an integer and displays its reversal.
*
*/

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = scanner.nextInt();
		reverse(number);
	}

	public static void reverse(int number) {
		int reverse = 0;
        
        while (number != 0) {
			reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

		System.out.println(reverse);
	}
}