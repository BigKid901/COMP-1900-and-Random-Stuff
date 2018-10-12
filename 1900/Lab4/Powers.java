import java.util.*;

public class Powers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int c = 0;

			System.out.println("Enter a positive integer (base): ");
				a = input.nextInt();

				int d = a;

			System.out.println("Enter a positive integer (power): ");
				b = input.nextInt();

				while (c < (b - 1)) {
					d = d * a;
					c ++;
				}
			System.out.println("Answer = " + d);
	}
}