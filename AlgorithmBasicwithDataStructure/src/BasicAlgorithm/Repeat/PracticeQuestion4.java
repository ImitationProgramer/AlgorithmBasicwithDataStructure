package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a값: ");
		int a = sc.nextInt();
		System.out.print("b값: ");
		int b = sc.nextInt();
		do {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b값: ");
			b = sc.nextInt();
		} while (a > b);
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}
