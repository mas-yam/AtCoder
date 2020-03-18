package abc.placingmarbles;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ones = str.replaceAll("0", "");
		System.out.println(ones.toCharArray().length);
	}
}
