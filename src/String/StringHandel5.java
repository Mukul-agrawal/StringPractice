package String;

import java.util.Scanner;

public class StringHandel5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();
        String subString = sc.nextLine().trim();
        String replace = sc.nextLine().trim();
        inputString = inputString.replaceAll(subString, replace);
        System.out.println(inputString);
        sc.close();
    }
}
