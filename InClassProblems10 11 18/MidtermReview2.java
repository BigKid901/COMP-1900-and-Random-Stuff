import java.util.*;

public class MidtermReview2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer value for the first number (a) which should be smaller than your second number: ");
		int a = input.nextInt();
		System.out.println();
		System.out.print("Enter an integer value for the second number (b) which should be larger than your first number: ");
		int b = input.nextInt();

		int potentialDivisor = a;
		int sum = 0;

		if (a < b) {

			while (potentialDivisor < (b + 1) ) {

				if (potentialDivisor % 2 != 0 && potentialDivisor % 7 == 0) {
					System.out.println(potentialDivisor);
					sum = sum + potentialDivisor;
				}
				potentialDivisor++;
			} 
			System.out.print("The sum is: " + sum);
		}


		else {
			System.out.print("a was not less than b");
		}
		
		
	}
}