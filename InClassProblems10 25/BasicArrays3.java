public class BasicArrays3 {
	public static void main(String[] args) {

		int[] x = {18, 90, 13, 283, 22};

		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] % 2 != 0) {
				System.out.println(x[i]);
			}
		}
	}
}
