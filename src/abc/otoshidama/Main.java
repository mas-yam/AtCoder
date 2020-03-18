package abc.otoshidama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		List<Integer> resultList = new ArrayList<>();
		for (int i = 0; i <= N; i++) {

			for (int j = 0; i+j <= N; j++) {

				if (i >= 0 && j >= 0 && (N - i - j) >= 0 && Y == (10000 * i + 5000 * j + (N - i - j) * 1000)) {
					resultList.add(i);
					resultList.add(j);
					resultList.add(N - i - j);
					break;
				}
			}
		}
		if (resultList.size() == 0) {
			System.out.println("-1 -1 -1");
		} else {
			System.out.println(resultList.get(0) + " " + resultList.get(1) + " " + resultList.get(2));
		}
	}
}
