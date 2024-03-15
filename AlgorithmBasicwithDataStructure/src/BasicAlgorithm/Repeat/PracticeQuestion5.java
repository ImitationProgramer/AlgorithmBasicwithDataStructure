package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수의 자릿수를 출력해주는 프로그램입니다.");
		System.out.print("정수를 입력하세요: ");
		String num = sc.next();
		char[] numArray = num.toCharArray();
		int length = numArray.length;
		System.out.println(num + "의 자릿수는 " + length + "입니다.");

	}

}
