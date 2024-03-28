package BasicDataStructure.Array;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 최댓값을 출력(값을 난수로 생성)
public class MaxOfArrayRand {
	// 배열 a의 최댓값을 구하여 반환
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (max < a[i])
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int n = sc.nextInt(); // 배열의 요솟수를 입력받음
		int[] height = new int[n]; // 요솟수가 num인 배열을 생성
		System.out.println("킷값은 다음과 같습니다.");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90); // 요솟값을 난수로 결정
			System.out.println("height[" + i + "]: " + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}

}
