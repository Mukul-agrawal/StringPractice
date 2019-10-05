package String;

import java.util.Scanner;

public class StringHandel9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();
        int upperWeight = 0;
        int lowerWeight = 0;
        int absoluteWeight;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c > 64 && c < 91) {
                upperWeight = upperWeight + inputString.charAt(i);
            } else if (c > 96 && c < 124) {
                lowerWeight = lowerWeight + inputString.charAt(i);
            }
        }
        absoluteWeight = upperWeight - lowerWeight;
        System.out.print("Absolute Weight is " + Math.abs(absoluteWeight));
        sc.close();
    }
}
