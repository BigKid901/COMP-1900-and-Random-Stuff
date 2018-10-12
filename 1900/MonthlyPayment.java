import java.util.*;

public class MonthlyPayment {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

//Prompting user to enter their data
      System.out.println("Enter the initial loan amount: ");
      double loan = scnr.nextDouble();

      System.out.println("Enter the annual interest rate (in %): ");
      double rate = (scnr.nextDouble()) * 0.01 / 12;

      System.out.println("Enter the number of years: ");
      double years = scnr.nextDouble();

//Intense math section
      double months = years * 12.0;

      double monthlyPayment = (double)loan * ((double)rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
      
      double totalPaid = monthlyPayment * months;
      double interestPaid = totalPaid - loan;

//Output to user
      System.out.println("Monthy Payment: " + monthlyPayment);
      System.out.println("Total Paid: " + totalPaid);
      System.out.println("Interest Paid: " + interestPaid);
	}
}