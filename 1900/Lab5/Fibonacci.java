import java.util.*;

public class Fibonacci {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		int n = 0;
		while (n < 2) { //To enter loop

		System.out.println("Enter your value for n: ");
		n = input.nextInt();

		if (n < 2) { //Check to exit loop
			System.out.println("Try Again (n must be greater than or equal to 2)");
			}
		}

		long fibNum = Math.pow(((1 + Math.sqrt(5)) / 2),n) - Math.pow(((1 - Math.sqrt(5)) / 2),n);
		fibNum = fibNum / 5.0;

		long prevNum = Math.pow(((1 + Math.sqrt(5)) / 2),(n - 1)) - Math.pow(((1 - Math.sqrt(5)) / 2),(n - 1));
		prevNum = prevNum / 5.0;

		System.out.println("The Fibonacci number at position " + n + " is " + fibNum);
		System.out.println("At that point, the ratio of that term with the previous term is " + fibNum + "/" + prevNum + " or " + (fibNum / prevNum) );

	}
}