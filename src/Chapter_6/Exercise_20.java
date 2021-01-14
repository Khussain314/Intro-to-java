import java.util.Scanner;

public class Exercise_20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter : ");
		String s = scanner.nextLine();

		System.out.println(countLetters(s));
	}

	public static int countLetters(String s) {
		int charCount = 0;
		for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            ch = Character.toUpperCase(ch);
            if ((ch >= 'A' && ch <= 'Z')) charCount++;
        }
        return charCount;
	}
}