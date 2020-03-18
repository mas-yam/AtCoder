package abc.kagamimochi;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new TreeSet<Integer>(new SetComparator());
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int num =  sc.nextInt();
			set.add(num);
		}
		System.out.println(set.size());
	}
}

class SetComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if(o2 > o1) {
			return 1;
		} else if(o2 < o1) {
			return -1;
		} else {
			return 0;
		}
	}

}