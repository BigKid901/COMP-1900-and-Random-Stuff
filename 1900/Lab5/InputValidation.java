import java.util.*;

public class InputValidation {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Grade Entering System"); // values initalized to start loops
		double userGrade = -1; 
		int gradeTries = 0; 
		int gradeFails = 0;

	if (userGrade < 0 || userGrade > 100) { 

		while (gradeFails < 5) {

			System.out.println("Enter a grade 0-100: ");
			userGrade = input.nextDouble();
			gradeTries++;

			if (userGrade < 0) {
				System.out.println("The guess has to be between 1 and 100");
				gradeFails++;
			}

			if (userGrade > 100) {
				System.out.println("The guess has to be between 1 and 100");
				gradeFails++;
			}
			}
		
		if (gradeTries == 5) {
			System.out.println("You are bad at entering numbers."); // exits for user after 5 tries
		}
	}

	

		System.out.println("You entered this grade: " + userGrade + " (Invalid attempts " + gradeFails + ")"); //Final Result
	}
}