package abc160.a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        if(S[2] == (S[3]) && S[4] == (S[5])){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
