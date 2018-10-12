import java.util.*;

public class PhoneNumbers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Enter a 10 digit phone number with no spaces or dashes: ");
      long phoneNumber = scnr.nextLong();
      
      long areaCode = phoneNumber / 10000000;

      long firstThree = phoneNumber % 10000000 / 10000;

      long lastFour = phoneNumber % 10000000 - (firstThree * 10000);
      
      System.out.println("Area Code: " + areaCode);
      System.out.println("First three digits: " + firstThree);
      System.out.print("Last four digits: " + lastFour);
	}
}