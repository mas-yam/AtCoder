package shiftonly;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextLine();
		String[] strs = sc.nextLine().split(" ");
		List<Integer> list = Arrays.stream(strs).map(s -> Integer.parseInt(s)).collect(Collectors.toList());

		Main main = new Main();
		main.filter(list);

		System.out.println(main.count);
	}

	public void filter(List<Integer> list) {

		int notCount = 0;
		for (Integer integer : list) {
			if (integer % 2 != 0) {
				notCount++;
			}
		}

		if (notCount == 0) {
			count++;
			filter(list.stream().map(i -> i / 2).collect(Collectors.toList()));
		}
	}
}
