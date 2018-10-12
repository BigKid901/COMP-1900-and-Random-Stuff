import java.util.*;

public class Paint {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double standardPaint = 14.99;
      double deluxePaint = 29.99;
//Room Dimensions 
      System.out.println("Enter the length of the room (in ft): ");
      double roomLength = scnr.nextDouble();

      System.out.println("Enter the height of the room (in ft): ");
      double roomHeight = scnr.nextDouble();

      System.out.println("Enter the width of the room (in ft): ");
      double roomWidth = scnr.nextDouble();

//Door Dimensions
      System.out.println("Enter the width of the door (in ft): ");
      double doorWidth = scnr.nextDouble();

      System.out.println("Enter the height of the door (in ft): ");
      double doorHeight = scnr.nextDouble();

      double doorArea = doorWidth * doorHeight;

//Window Dimensions
      System.out.println("Enter the width of the window (in ft): ");
      double windowWidth = scnr.nextDouble();

      System.out.println("Enter the width of the window (in ft): ");
      double windowHeight = scnr.nextDouble();

      double windowArea = windowWidth * windowHeight;


//Time for math... and outputs
      double totalWallArea = (( (double) roomLength * (double) roomHeight * 2) + ( (double) roomWidth *  (double) roomHeight * 2)) - (doorArea + windowArea);

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("-----The paintable wall area in your room is " + totalWallArea + " square feet.-----");
      System.out.println(" ");

      double paintCans = totalWallArea / 250 + 1;
      if (paintCans % 1 == 0) {
             paintCans = paintCans --;
      }
      
      System.out.println("-----You will need " + (int) paintCans + " cans of paint.-----");
      System.out.println(" ");


//Standard or Regular
      System.out.println("Choose a type of paint. Standard or Deluxe?");
      System.out.println("Press 1 for standard. Press 2 for deluxe.");
      double choice = scnr.nextDouble();

      if (choice == 1) {
      	double priceBeforeTax = ((int) paintCans) * standardPaint;
      	double priceAfterTax = (priceBeforeTax * 0.0925) + priceBeforeTax;

	      System.out.println("-----That will cost $" + (priceBeforeTax) + " before tax.-----");
	      System.out.println("-----The Tennessee sales tax will be $" + (priceBeforeTax * 0.0925) + "-----");
	      System.out.println("-----The total cost is $" + (priceAfterTax) + ".-----");
	   }
      else if (choice == 2) {
      	double priceBeforeTax = ((int) paintCans) * deluxePaint;
      	double priceAfterTax = (priceBeforeTax * 0.0925) + priceBeforeTax;

	      System.out.println("-----That will cost $" + (priceBeforeTax) + " before tax.-----");
	      System.out.println("-----The Tennessee sales tax will be $" + (priceBeforeTax * 0.0925) + "-----");
	      System.out.println("-----The total cost is $" + (priceAfterTax) + ".-----");
	   }
      else {
	      System.out.println("That is not a choice.");
	      System.out.println("Now, you'll have to enter all of the information again  :P");
	   }
  }
}