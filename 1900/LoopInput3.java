// 2 1 1 User input with loops
import java.util.Scanner;

public class LoopInput3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Write a loop that allows the user to repeatedly enter integer
		//  inputs.  The loop should stop once the sum of all *positive*
		//  integers entered by the user reaches 100 or more.  Integers
		//  that aren't positive should *not* be counted towards this sum.

		int posSum = 0;
		int userInput = 0;
		while (posSum < 100) {			// COMPLETE THIS LINE
			System.out.println("Enter an integer:");
			userInput = input.nextInt();
			if (userInput >= 0) {			// COMPLETE THIS LINE
				posSum += userInput;
			}
		}
	
	}
}
