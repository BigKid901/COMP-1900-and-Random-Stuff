import java.util.*;

public class GuessingGame {
	public static void main(String [] args) {
		Random randGen = new Random();
		Scanner input = new Scanner(System.in);

		int guessingNum = randGen.nextInt(100) + 1; //Generates a random number between 1-100 inclusive
		
		System.out.println("I'm thinking of an integer between 1 and 100.  Try to guess what it is!");
		int userGuess = 0; //This has to be initialized at 0 to automatically trigger the loop
		int guessTries = 0; 

		while (userGuess != guessingNum) { //Loop that powers the game

			System.out.println("Enter your guess: ");
			userGuess = input.nextInt();
			guessTries++;

			if (userGuess < 1) {
				System.out.println("The guess has to be between 1 and 100");
				guessTries--;
			}

			else if (userGuess < guessingNum) {
				System.out.println("That's too low!");
			}

			else if (userGuess > guessingNum) {
				System.out.println("That's too high!");
			}
		}

		System.out.println("You got it!  It took you " + guessTries + " tries to get the right number."); //Final Result
	}
}