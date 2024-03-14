package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion2 {

	public static void main(String[] args) {
		// 1~10의 합을 가우스의 덧셈을 사용하여 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요: ");
		int n = sc.nextInt();
		int gaus = 0;
		if (n % 2 == 0)
			gaus = (1 + n) * (n / 2);
		else
			gaus = (1 + n) * (n / 2) + n / 2 + 1;

		System.out.println("1부터 입력하신 숫자 " + n + "까지의 합은 " + gaus + "입니다.");

	}

}
