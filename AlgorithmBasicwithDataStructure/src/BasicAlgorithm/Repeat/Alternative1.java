package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class Alternative1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("+와 -를 번갈아 n개 출력합니다.");
		System.out.print("n값:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1)
				System.out.print("+");
			else
				System.out.print("-");
		}

	}

}
