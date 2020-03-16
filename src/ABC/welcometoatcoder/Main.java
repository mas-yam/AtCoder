package ABC.welcometoatcoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		sum += sc.nextInt();
		sc.nextLine();

		String secondLine = sc.nextLine();
		sum += Integer.parseInt(secondLine.split(" ")[0]) + Integer.parseInt(secondLine.split(" ")[1]);
		System.out.println(sum + " " + sc.nextLine());

		sc.close();
	}
}
