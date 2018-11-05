public class BasicArrays2 {
	public static void main(String[] args) {

		int[] x = {18, 90, 13, 283, 22};

		int donuts = 0;

		for (int i = x.length - 1; i >= 0; i--){
			donuts += x[i];
		}
		System.out.print(donuts);
	}
}
