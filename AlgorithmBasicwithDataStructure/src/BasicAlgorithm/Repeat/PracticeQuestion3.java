package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 사이의 모든 정수의 합을 구합니다.");
		System.out.print("첫 번째 정수: ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수: ");
		int b = sc.nextInt();
		System.out.println(a + "와 " + b + "사이에 있는 정수들의 합은 " + sumof(a, b) + "입니다.");

	}

	static int sumof(int a, int b) {
		int sum = 0;
		if (a > b)
			for (int i = b; i <= a; i++)
				sum += i;
		else
			for (int i = a; i <= b; i++)
				sum += i;
		return sum;
	}
}
