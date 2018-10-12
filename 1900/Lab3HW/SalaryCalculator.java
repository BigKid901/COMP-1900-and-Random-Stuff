import java.util.*;

public class SalaryCalculator {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int total;

		System.out.println("Enter Grade:");
		int gradePart = input.nextInt();

		System.out.println("Enter step:");
		int stepPart = input.nextInt();


switch (stepPart) {
   case 1:

      switch (gradePart) {
      	case 1:
      		total = 18785;
      	break;
      	case 2:
      		total = 21121;
      	break;
      	case 3:
      		total = 23045;
      	break;
      	case 4:
      		total = 25871;
      	break;
      	default:
      		total = 1;
      	break;
      }
      break;

   case 2:
      switch (gradePart) {
   		case 1:
      		total = 19414;
      	break;
      	case 2:
      		total = 21624;
      	break;
      	case 3:
      		total = 23813;
      	break;
      	case 4:
      		total = 26733;
      	break;
      	default:
      		total = 1;
      	break;
      }
      break;

   case 3:
      switch (gradePart) {
   		case 1:
      		total = 20039;
      	break;
      	case 2:
      		total = 22323;
      	break;
      	case 3:
      		total = 24581;
      	break;
      	case 4:
      		total = 27595;
      	break;
      	default:
      		total = 1;
      	break;
      }
      break;

   default:
      total = 1;
      break;
}

System.out.println("Your salary is " + total);
	}
}