public class ArrayIntersection {
	public static void main(String[] args) {
		System.out.println("These are the common values in these arrays");
		int[] y = {5, 3, 1, 4};
		int[] x = {6, 10, 3, 7, 5};
		int z = 0;
		int commonElements = 0;
		

	for (int i = 0; i <= x.length - 1; i++) {
		while (z < x.length) {

			if (x[i] == y[z]) {
				System.out.println(x[i]);
				commonElements++;
			}

			z++;
		}
		z = 0;
	}

		
		System.out.println(commonElements);
	}
}