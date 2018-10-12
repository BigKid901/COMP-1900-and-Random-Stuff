import java.util.*;

public class MovieTickets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double regularTix = 8;
		int childTix = 0;
		double seniorTix = 6.50;
		int partyNumber = 1;
		double seniorPrice = 0;
		int childPrice = 0;
		double regPrice = 0;
		int seniorPeople = 0;
		int regPeople = 0;
		int childPeople = 0;
		int age = 0;

		System.out.println("When is your showing:");
		int showtime = input.nextInt();

		

			if (showtime > 1700) {

				while (age >= 0) {
					System.out.println("Enter the age of party member (enter a negative integer to stop) " + partyNumber);
					age = input.nextInt();

					if (age > 0) {
						if (age> 64) {
							seniorPrice += 8;
							seniorPeople ++;
						}
						if (age > 10) {
							regPrice += 10.50;
							regPeople ++;
						}
						if (age < 11) {
							childPrice += 4;
							childPeople ++;
						partyNumber ++;
					}
			}
		}
	}

			else {
				while (age >= 0) {
					System.out.println("Enter the age of party member (enter a negative integer to stop) " + partyNumber);
					age = input.nextInt();

					if (age > 0) {
						if (age > 64) {
							seniorPrice += 6.50;
							seniorPeople ++;
						}
						if (age > 10) {
							regPrice += 8;
							regPeople ++;
						}
						if (age < 11) {
							childPrice += 0;
							childPeople ++;
						partyNumber ++;
					}
			}
		}
	}
		System.out.println("Regular x " + regPeople + " = $" + regPrice);
		System.out.println("Child x " + childPeople + " = $" + childPrice);
		System.out.println("Regular x " + seniorPeople + " = $" + seniorPrice);
		System.out.println("Total: $" + (regPrice + childPrice + seniorPrice));
	}
}