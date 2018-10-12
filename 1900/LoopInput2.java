// 2 1 1 User input with loops
import java.util.Scanner;

public class LoopInput2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Write a loop that allows the user to repeatedly enter integer
		//  inputs.  The loop should stop once the user has entered 5
		//  odd integers.

		int oddCount = 0;
		int userInput = 0;
		while (oddCount < 5) {			// COMPLETE THIS LINE
			System.out.println("Enter an integer:");
			userInput = input.nextInt();
			if (userInput % 2 == 1) {		// COMPLETE THIS LINE
				oddCount++;
			}
		}
	
	}
}
