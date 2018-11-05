import java.util.*;

public class RunAnalyzer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many weeks of data do you have?"); //Entering the ammount of weeks
		int weeks = input.nextInt();

		int weekCounter = 1; //Declaring a lot of variables
		double milesTotal = 0;
		double lastWeek = 0;
		boolean increase = true;
		double temp = 0.0;
		double milesTempDifference = 0;

		double[] milesArray = new double[weeks];//Array

		for (int i = 0 ; i < milesArray.length; i++ ) {
           System.out.println("Enter miles for week " + weekCounter + ": ");
           temp = milesArray[i];
           milesArray[i] = input.nextDouble();

           if (milesArray[i] <= temp) {
           	increase = false;
           }

           milesTotal += milesArray[i];
       	   milesTempDifference += (milesArray[i] - temp) / weekCounter;
           weekCounter++;
        }

        double milesAverage = milesTotal / weeks;
		
		if (increase == false) {
			System.out.println("Your weekly mileage is NOT consistently increasing!");
		}

		if (increase == true) {
			System.out.println("Your weekly mileage is consistently increasing!");
		}

		
		System.out.println("Your average mileage was " + milesAverage); //Output
		System.out.println("Average weekly mileage change: " + milesTempDifference);
	}
}