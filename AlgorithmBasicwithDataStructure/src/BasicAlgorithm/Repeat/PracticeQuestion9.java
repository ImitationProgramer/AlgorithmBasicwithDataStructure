package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		int n;
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = sc.nextInt();
		} while (n <= 0);
		triangleLB(n);
		System.out.println("2. 왼쪽 위가 직각인 이등변삼각형을 출력합니다.");
		triangleLU(n);
		System.out.println("3. 오른쪽 위가 직각인 이등변삼각형을 출력합니다.");
		triangleRU(n);
		System.out.println("4. 오른쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		triangleRB(n);
		System.out.println("5. n단의 피라미드를 출력합니다.");
		spira(n);
		System.out.println("6. n단의 숫자 피라미드를 출력합니다.");
		npira(n);
	}

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < i - 1; k++)
				System.out.print(" ");
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(' ');
			for (int k = 0; k < i; k++)
				System.out.print('*');
			for (int l = 1; l < i; l++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(' ');
			for (int k = 0; k < i; k++)
				System.out.print(i % 10);
			for (int l = 1; l < i; l++)
				System.out.print(i % 10);
			System.out.println();
		}
	}
}
