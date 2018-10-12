import java.util.*;

public class EasterSunday {
	public static void main(String[] args) {

		
		int a;
		int b;
		int c;
		int d;
		int e;
		int g;
		int h;
		int j;
		int k;
		int r;
		int m;
		int n;
		int p;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the year:");
		int year = scnr.nextInt();

		a = year % 19;

		b = year / 100;
		c = year % 100;

		d = b / 4;
		e = b % 4;

		g = (8 * b + 13) / 25;

		h = (19 * a + b - d - g + 15) % 30;

		j = c / 4;
		k = c % 4;

		m = (a + 11 * h) / 319;

		r = (2 * e + 2 * j - k - h + m + 32) % 7;

		n = (h - m + r + 90) / 25;

		p = (h - m + r + n + 19) % 32;

		System.out.print("In " + year + ", Easter Sunday is on " + n + "/" + p + ".");
	}
}