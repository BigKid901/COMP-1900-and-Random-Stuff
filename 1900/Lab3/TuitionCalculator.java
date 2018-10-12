import java.util.*;

public class TuitionCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.print("How many total hours are you taking? ");
      int totalHours = scnr.nextInt();

      System.out.print("How many of those hours are from engineering/science classes? ");
      int esHours = scnr.nextInt();

      int creditHourCharge = totalHours * 400;
      int stemCharge = esHours * 25;
      int extraCreditsCharge;
      if (totalHours > 12) {
         extraCreditsCharge = (totalHours - 12) * 60;
      }
      else {
      	extraCreditsCharge = 0;
      }
      int totalTuition = creditHourCharge + stemCharge + extraCreditsCharge;
      
      System.out.println("($400 per credit hour) * (" + totalHours + " credit hours) = $" + creditHourCharge);
      System.out.println("($60 extra per every credit hour beyond 12) * (" + (totalHours - 12) + " credit hours) = $" + extraCreditsCharge);
      System.out.println("($25 extra per engineering/science credit hour) * (" + esHours + " credit hours) = $" + stemCharge);
      System.out.println(" ");
      System.out.println("Your total tuition is $" + totalTuition);
  }
}