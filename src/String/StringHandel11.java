package String;

import java.util.Scanner;

public class StringHandel11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine().trim();
        System.out.println("Enter a character :");
        char ch = sc.nextLine().trim().charAt(0);
        System.out.println("output :");
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
