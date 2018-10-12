// 2 1 1 User input with loops
import java.util.Scanner;

public class LoopInput1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Write a loop that allows the user to repeatedly enter integer
		//  inputs, until s/he enters a value of -999 to stop.  Any other
		//  value should keep the loop going.

		int userInput = 1;		// COMPLETE THIS LINE
		while (userInput != -999) {				// COMPLETE THIS LINE
			System.out.println("Enter an integer (-999 to stop):");
			userInput = input.nextInt();
		}
	}
}
