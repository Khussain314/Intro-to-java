import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides of Triangle: ");
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();

		System.out.println(isValid(side1, side2, side3));
		System.out.println(area(side1, side2, side3));	
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if((side1!=0) && (side3!=0) && (side3!=0)){
			if(side1==side2 && side2==side3 && side1+side2>side3 && side2+side3>side1 && side1+side3>side2)return true;
			else return false;
		}
		else return false;
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		return (s*(s-side1)*(s-side2)*(s-side3))*0.5;
	}
}