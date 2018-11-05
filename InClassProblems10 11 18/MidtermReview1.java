import java.util.*;

public class MidtermReview1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer value for n: ");
		int n = input.nextInt();
		System.out.println();

		int potentialDivisor = 0;
		int divisorCount = 0;

		while (potentialDivisor < n) {
			potentialDivisor ++;

			if (n % potentialDivisor == 0) {
				System.out.println(potentialDivisor);
				divisorCount++;
			}
		}

		System.out.println();
		System.out.println("There are " + divisorCount + " divisors.");
	}
}