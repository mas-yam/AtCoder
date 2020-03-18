package abc158.taxincrease;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A>B) {
			System.out.println(-1);
			return;
		}

		int min = 0;
		for (int i = 1; i <= 1009; i++) {
			int i008 = (int)(i*0.08);
			int i010 = (int)(i*0.1);
			if(i008 == A && i010 == B) {
				min = i;
				break;
			}
		}
		if(min==0){
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}
}
