import java.util.Scanner;

public class TollCalc2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int timeHour;
		int timeMinute;

		System.out.println("Enter time (hour):");
		int timeHour = input.nextInt();

		System.out.println("Enter time minute (minute):");
		int timeMinute = input.nextInt();

		if (timeHour < 6) {
			tollAmount = 1.55;
		}
		else if (timeHour < 10) {
			tollAmount = 4.65;
		}
		else if (timeHour < 18) {
			tollAmount = 2.35;
		}
		else {
			tollAmount = 1.55;
		}

		System.out.println("Time is" + timeHour + ":" + timeMinute);
		System.out.print("Toll owed is $" + tollAmount);
	}
}