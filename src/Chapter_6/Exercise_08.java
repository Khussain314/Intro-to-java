//import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Enter your celsius: ");
		//double celsius = scanner.nextDouble();
		//System.out.print("Enter your fahrenheit: ");
		//double fahrenheit = scanner.nextDouble();

		System.out.printf("%1s%20s%10s%19s%20s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
		System.out.println("_____________________________________________________________________________");

		for(double celsius = 40.0, fahrenheit = 120.0; celsius>=31; celsius--, fahrenheit-=10){
			System.out.printf("%-7s%20.2f%10s%19s%20.2f\n", celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}

//System.out.printf("%-7s%20.2f%10s%20s%20.2f\n", celsius, celsiusToFahrenheit(celsius), "|", fahrenheit, fahrenheitToCelsius(fahrenheit));