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
            if (isLetter(ch)) charCount++;
        }
        return charCount;
	}

	public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}