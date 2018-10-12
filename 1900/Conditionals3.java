import java.util.Scanner;

public class Conditionals3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first integer:");
		int a = input.nextInt();

		System.out.println("Enter the second integer:");
		int b = input.nextInt();

		if ( a % b ==0|| b % a == 0 ) {
			System.out.println("The numbers are friendly");
		}
		else {
			System.out.println("The numbers are not friendly");
		}
	}
}