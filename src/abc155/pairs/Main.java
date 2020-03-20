package abc155.pairs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	/**
	 * 未完
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		Set<Integer> minus = new TreeSet<>();
		Set<Integer> plus = new TreeSet<>();

		int plusCount = 0;
		int zeroCount = 0;
		int minusCount = 0;

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();

			if (A > 0) {
				plusCount += 1;
				plus.add(A);
			} else if (A == 0) {
				zeroCount += 1;
			} else {
				minusCount += 1;
				minus.add(A);
			}
		}

		long lessThanZero = minusCount * plusCount;
		long lessThanOne = (minusCount * plusCount) + (zeroCount * plusCount) + (zeroCount * minusCount);
		if (lessThanZero >= K) {
			System.out.println("less");
		} else if (lessThanOne >= K) {
			System.out.println(0);
		} else {
			long K1 = K - lessThanOne;

			for (Integer integer : plus) {

			}
			System.out.println("more");
		}
	}
}
