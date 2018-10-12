import java.util.*;

public class Combinations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//b = n!
//g = k!
//p = (n - k)!
		long total;
		System.out.println("Enter a positive integer (n): ");
				int n = input.nextInt();
		System.out.println("Enter a positive integer (k): ");
				int k = input.nextInt();

				long a = 1;
				long c = 1;
				long f = 1;
				long b = n;
				long d = k;
				long e = n - k;
				long p = e;
				

				while (n > a) {
					b = b * (a - n);
					a++;
				}

				while (k > c) {
					d = d * (c - k);
					c++;
				}

				while (e > f) {
					p = p * (f - e);
					f++;
				}


		total = b / (p * k);
		System.out.println("The answer is " + total);
	}
}