package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PrintStars1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		System.out.print("n값: ");
		int n = sc.nextInt();
		System.out.print("w값: ");
		int w = sc.nextInt();
		for (int i = 0; i < n / w; i++) {
			for (int j = 0; j < w; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i < n % w; i++)
			System.out.print("*");

	}

}
