package String;

import java.util.Scanner;

public class StringHandel7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine().trim();
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            sum = sum + inputString.charAt(i);
        }
        System.out.println("total weight of given string : " + sum);
        sc.close();
    }
}
