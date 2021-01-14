import java.util.Scanner;

public class Exercise_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = scanner.nextLine();
		checkPassword(password);

	}
	public static void checkPassword(String password) {
		int charCount = 0;
		int numCount = 0;

		if(password.length()<8){
			System.out.println("Password is not valid");
		}else{
			for (int i = 0; i < password.length(); i++) {

            	char ch = password.charAt(i);

            	if(isNumeric(ch)) numCount++;
            	else{
            		System.out.println("Password is not valid");
            		break;
            	}
            	
            	if (isLetter(ch)) charCount++;
            	else{
            		System.out.println("Password is not valid");
            		break;
            	}
            }
        
		}
	}
	
	public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
}