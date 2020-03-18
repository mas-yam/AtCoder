package abc.somesums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			int sum = 0;
			for(char c : String.valueOf(i).toCharArray()) {
				sum += Integer.parseInt(String.valueOf(c));
			}
			if(A <= sum && B >= sum) {
				list.add(i);
			}
		}
		System.out.println(list.stream().mapToInt(i -> i).sum());
	}
}
