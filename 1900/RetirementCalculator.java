import java.util.*;

public class RetirementCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//Entering all the data

		System.out.println("Initial amount of money:");
		double initialAmount = input.nextDouble();

		System.out.println("Target amount at age 65:");
		double targetAmount = input.nextDouble();

		System.out.println("Contribution per year:");
		double yearlyAmount = input.nextDouble();

		System.out.println("Annual growth in percent:");
		double yearlyPercent = input.nextDouble();

		System.out.println("Your current age:");
		int age = input.nextInt();
		System.out.println();
		
		int years = 65;

//Setting up the table		
		System.out.printf("%5s%15s%15s%15s\n", "Age", "Interest", "Contribution", "End Balance");
		System.out.println();
		int y = age + 1;

		
		while (y <= years) {
			double interest = (yearlyPercent / 100) * initialAmount;
			initialAmount += interest + yearlyAmount;
			System.out.printf("%5d%15.2f%15.2f%15.2f\n", y, interest, yearlyAmount, initialAmount);
			y++;
		}
	}
	}
