package BasicAlgorithm.Algorithm;

import java.util.Scanner;

public class PracticeQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++)
			for (int j = 1; j <= 3; j++)
				for (int k = 1; k <= 3; k++)
					System.out.println("med(" + i + "," + j + "," + k + ") = " + med3(i, j, k));
	}

	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
}
