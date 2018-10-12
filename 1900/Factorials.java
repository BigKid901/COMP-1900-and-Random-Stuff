import java.util.*;

public class Factorials {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.println("Enter a positive integer (n): ");
	long n = input.nextLong();
	long a = 1;
	long b = n;

	while (n > a) {
		b = b * (a - n);
		a++;
	}

	
	System.out.println(b);
	}
}