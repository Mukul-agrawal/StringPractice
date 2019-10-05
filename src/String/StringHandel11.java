package String;

import java.util.Scanner;

public class StringHandel11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();
        char ch = sc.nextLine().trim().charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
