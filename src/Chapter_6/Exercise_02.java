/*
* Chapter 6 Exercise 2:
*	
*	(Sum the digits in an integer) Write a method that computes the sum of the digits
*	in an integer. Use the following method header:
*
*	public static int sumDigits(long n)
*
*	For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
*	to extract digits, and the / operator to remove the extracted digit. For instance,
*	to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
*	(= 23). Use a loop to repeatedly extract and remove the digit until all the digits
*	are extracted. Write a test program that prompts the user to enter an integer and
*	displays the sum of all its digits.
*/


import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you digits");
		long digits = scanner.nextInt();
		System.out.println(sumDigits(digits));

	}

	public static int sumDigits(long n){
		int digit = 0; //for digit in loop for
		int sum = 0;
		long a = n;  //for loop while

		while(true){
			if(a/10 != 0){
				digit += 1;
				a /= 10;
			}else{
				digit +=1;
				break;
			}
		}

		for(int i=0; i<digit; i++){
			sum += n% 10;
			n /= 10;	
		}
		return sum;
	}
}