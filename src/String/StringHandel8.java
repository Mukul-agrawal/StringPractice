package String;

import java.util.Scanner;

public class StringHandel8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c > 64 && c < 92) {
                sum = sum + inputString.charAt(i);
            }
        }
        System.out.println("total weight of uppercase character :");
        System.out.print(sum);
        sc.close();
    }
}

