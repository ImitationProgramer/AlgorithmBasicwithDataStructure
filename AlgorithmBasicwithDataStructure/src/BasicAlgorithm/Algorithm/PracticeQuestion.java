package BasicAlgorithm.Algorithm;

import java.util.Scanner;

public class PracticeQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비교할 숫자의 개수(3, 4): ");
		int number = sc.nextInt();
		if (number == 3) {
			System.out.print("a의 값: ");
			int a = sc.nextInt();
			System.out.print("b의 값: ");
			int b = sc.nextInt();
			System.out.print("c의 값: ");
			int c = sc.nextInt();
			System.out.println("최솟값은 " + min3(a, b, c));
		} else {
			System.out.print("a의 값: ");
			int a = sc.nextInt();
			System.out.print("b의 값: ");
			int b = sc.nextInt();
			System.out.print("c의 값: ");
			int c = sc.nextInt();
			System.out.print("d의 값: ");
			int d = sc.nextInt();
			System.out.println("최댓값은 " + max4(a, b, c, d) + " 최솟값은 " + min4(a, b, c, d));
		}

	}

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;
		return max;
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}
}
