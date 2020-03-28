package abc160.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int maxDifference = 0;
        int[] maxDeferenceIndex = new int[2];

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
            if (i > 0) {
                int oldMaxDifference = maxDifference;
                maxDifference = Math.max(maxDifference, list.get(i) - list.get(i - 1));
                if (maxDifference > oldMaxDifference) {
                    maxDeferenceIndex[0] = i - 1;
                    maxDeferenceIndex[1] = i;
                }
            }
        }

        if(maxDifference <= list.get(0) + K - list.get(list.size()-1)){
            System.out.println(list.get(list.size()-1) - list.get(0));
        } else {
            int lap = list.get(maxDeferenceIndex[0]) + K - list.get(maxDeferenceIndex[1]);
            System.out.println(lap);
        }
    }
}
