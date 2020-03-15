package cardgamefortwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] strs = sc.nextLine().split(" ");

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new MainComparator());
		queue.addAll(Arrays.asList(strs).stream().map(Integer::parseInt).collect(Collectors.toList()));

		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();
		while(!queue.isEmpty()) {
			alice.add(queue.poll()); // Alice
			if(!queue.isEmpty()) {
				bob.add(queue.poll()); // Bob
			}
		}
		System.out.println(alice.stream().mapToInt(i -> i).sum() - bob.stream().mapToInt(i -> i).sum());
	}
}

class MainComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if(o1 > o2) {
			return -1;
		} else if(o2 > o1) {
			return 1;
		} else {
			return 0;
		}
	}
}