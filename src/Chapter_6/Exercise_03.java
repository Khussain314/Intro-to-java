/*
*Chapter 6 Exercise 3:
*	
*	(Palindrome integer) Write the methods with the following headers
*	
*	// Return the reversal of an integer, i.e., reverse(456) returns 654
*	public static int reverse(int number)
*	
*	// Return true if number is a palindrome
*	public static boolean isPalindrome(int number)
*	
*	Use the reverse method to implement isPalindrome. A number is a palindrome
*	if its reversal is the same as itself. Write a test program that prompts the
*	user to enter an integer and reports whether the integer is a palindrome.
*/

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = scanner.nextInt();
		System.out.println(reverse(number));
		System.out.println(isPalindrome(number));
	}

	public static int reverse(int number) {
		int n = 0;  //for loop for2
		int number2 = number; // for loop while
		int reverse = 0;  // for loop for2
		int a = 1;   // for loop for
		
		while(true){
			if(number2/10 != 0){
				n += 1;
				number2 /= 10;
			}else{
				n +=1;
				break;
			}
		}

		for(int i=0; i<(n-1); i++){
			a *= 10;
		}

		for(int i=0; i<n; i++){      // loop for2
			reverse += (number % 10) * a;
			number /= 10;
			a /= 10;
		}

		return reverse;
	}

	public static boolean isPalindrome(int number) {
		if(reverse(number) == number){
			return true;
		}else{
			return false;
		}
	}
}