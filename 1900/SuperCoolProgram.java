import java.util.*;

public class SuperCoolProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      System.out.println("Press 1 if you like pizza ");
      System.out.println("Press 2 if you like hotdogs ");
      System.out.println("Press 3 if you like hamburgers");
      System.out.println("Press 4 if you like tacos ");
      System.out.println(" ");
      int userInput1 = scnr.nextInt();
      
      if (userInput1 == 1){
            System.out.print("Pizza with pineapples is awesome.");
      }

      if (userInput1 == 2){
             System.out.print("Hot dogs with chili and cheese are awesome.");
      }

      if (userInput1 == 3){ 
            System.out.print("Hamburgers with cheese and bacon are awesome.");
      }

      if (userInput1 == 4){
             System.out.print("Tacos with chicken and cheese are awesome.");
      }

      if (userInput1 > 4){
            System.out.print("Not an option");
      }
      if (userInput1 < 1){
            System.out.print("Not an option");
      }
	}
}