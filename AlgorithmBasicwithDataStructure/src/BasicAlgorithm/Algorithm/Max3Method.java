package BasicAlgorithm.Algorithm;

public class Max3Method {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.println("max3(" + i + "," + j + "," + k + ") = " + max3(i, j, k));
				}
			}
		}

	}

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}
}
