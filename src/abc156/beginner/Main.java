package abc156.beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = sc.nextInt();

		// N >= 10 R == 内R
		// N < 10  R == 内R - 100 * (10-K)

		if(N>=10) {
			System.out.println(R);
		} else {
			System.out.println(R + 100*(10-N));
		}
	}
}
