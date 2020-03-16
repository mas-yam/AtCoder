package ABC.coins;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int handred = 500;
		int fifty = 100;
		int ten = 50;

		int count = 0;

		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					int sum = (i * handred) + (j * fifty) + (k * ten);
					if(sum > X) {
						break;
					} else if(sum == X) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
