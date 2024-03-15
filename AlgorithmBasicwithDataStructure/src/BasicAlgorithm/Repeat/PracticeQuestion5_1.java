package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수의 자릿수를 출력해주는 프로그램입니다.");
		System.out.print("정수를 입력하세요: ");
		long num = sc.nextLong();
		long firstnum = num;
		int length = 0;

		do {
			num = num / 10;
			length++;
		} while (num != 0);
		System.out.println(firstnum + "의 자릿수는 " + length + "입니다.");
	}

}
