package BasicAlgorithm.Algorithm;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구하여 출력
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		System.out.println("최댓값은 " + max + "입니다.");
	}

}
