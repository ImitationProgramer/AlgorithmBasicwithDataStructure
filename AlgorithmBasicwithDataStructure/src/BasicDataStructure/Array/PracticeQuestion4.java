package BasicDataStructure.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestion4 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i - 1);
	}

	static void rcopy(int[] a, int[] b) {
		reverse(b);
		for (int i = 0; i < b.length; i++)
			a[i] = b[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int n = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		rcopy(y, x);

		System.out.println(Arrays.toString(y));
	}

}
