/**
 * Chapter 6 Exercise 1:
 *
 *      (Math: pentagonal numbers) A pentagonal number is defined as
 *      n(3n–1)/2 for n = 1,2,...,and soon. Therefore, the first few numbers are
 *      1, 5, 12, 22,....
 *      Write a method with the following header that returns a pentagonal number:
 *      public static int getPentagonalNumber(int n)
 *      Write a test program that uses this method to display the first 100 pentagonal
 *      numbers with 10 numbers on each line.    
 */
//System.out.printf("%10s",(i % 8 != 0) ? getPentagonalNumber(i) + " " : getPentagonalNumber(i) + "\n");

public class Exercise_01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if(i % 10 != 0){
            	System.out.printf("%10s",getPentagonalNumber(i));
            }else{
            	System.out.printf("%10s",getPentagonalNumber(i) + "\n");
            }

        }

        System.out.println();

        for (int i = 1; i <= 100; i++) {

            System.out.printf("%10s",(i % 10 != 0) ? getPentagonalNumber(i) + "    " : getPentagonalNumber(i) + "    " + "\n");

        }

    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}