import java.util.Scanner;

public class Conditionals1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int x = input.nextInt();

		if (x % 2 == 0) {
			System.out.println("That number is even.");
		}
		else {
			System.out.println("That number is odd.");
		}
	}
}