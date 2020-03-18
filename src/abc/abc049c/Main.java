package abc.abc049c;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";

		if (!S.contains(dream) && !S.contains(erase)) {
			System.out.println("NO");
			return;
		}

		String result = new Main().recurse(S);
		if (result.replaceAll("\\*","").equals("")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public String recurse(String str) {

		String replaced1 = str.replaceAll("dreameraser", "*");
		String replaced2 = replaced1.replaceAll("dreamerase", "*");
		String replaced3 = replaced2.replaceAll("dreamer|eraser", "*");

		return replaced3.replaceAll("dream|erase", "*");
	}
}
