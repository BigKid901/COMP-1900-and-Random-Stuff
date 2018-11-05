import java.util.*;

//Alternating sum = a - b + c - d + e

public class AlternatingSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 5 integers.");

		int a = input.nextInt(); //The inputs used for the array
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();

		int[] array1 = {a, b, c, d, e};
		int total = 0;

		for (int i = 0; i <= array1.length - 1; i++) { //Adding for the 1st, 3rd, and 5th input
			if (i % 2 == 0) {
				total += array1[i];
			}

			else {
				total = total - array1[i]; //Subtracting for the 2nd and 4th input
			}
		}

		System.out.println();
		System.out.println("The alternating sum is: " + total);
	}
}