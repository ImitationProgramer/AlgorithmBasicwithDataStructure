package BasicAlgorithm.Repeat;

import java.util.Scanner;

public class PracticeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
			System.out.println(i);
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
