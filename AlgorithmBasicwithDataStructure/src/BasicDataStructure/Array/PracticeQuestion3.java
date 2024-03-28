package BasicDataStructure.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestion3 {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++)
			a[i] = b[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int n = sc.nextInt();

		int[] x = new int[n]; // 요솟수가 n인 배열
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		System.out.println("요소의 합계는 " + sumOf(x) + "입니다.");
		copy(y, x);
		System.out.println("복사한 배열의 요소: " + Arrays.toString(y));
	}

}
