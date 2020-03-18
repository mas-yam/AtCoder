package abc.abc086c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int t_1 = 0;
		int t = 0;
		int x_1 = 0;
		int x = 0;
		int y_1 = 0;
		int y = 0;

		boolean result = true;

		for (int i = 0; i < N; i++) {

			String[] line = sc.nextLine().split(" ");

			t = Integer.parseInt(line[0]);
			x = Integer.parseInt(line[1]);
			y = Integer.parseInt(line[2]);

			int dt = t-t_1;
			int dx = Math.abs(x-x_1);
			int dy = Math.abs(y-y_1);

			if(dx + dy > dt || (dt-dx-dy) % 2 == 1) {
				result = false;
				break;
			}

			t_1 = t;
			x_1 = x;
			y_1 = y;
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
