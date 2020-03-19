package abc156.Digits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N  = sc.nextInt();
		int K  = sc.nextInt();

		if(N==1) {
			System.out.println(1);
			return;
		}

		for (int i = 0;; i++) {
			int Ki = (int)Math.pow(K, i);
			if(N <= Ki) {
				System.out.println(i);
				break;
			}
		}
	}
}
