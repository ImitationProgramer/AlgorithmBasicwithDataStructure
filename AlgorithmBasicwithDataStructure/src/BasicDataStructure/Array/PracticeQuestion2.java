package BasicDataStructure.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestion2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(Arrays.toString(a));
			swap(a, i, a.length - i - 1);
			System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]을 교환합니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int n = sc.nextInt();

		int[] x = new int[n]; // 요솟수가 n인 배열

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		reverse(x);
		System.out.println(Arrays.toString(x));
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
