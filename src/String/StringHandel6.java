package String;

import java.util.Scanner;

public class StringHandel6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine().trim();
        System.out.println("String in uppercase :");
        System.out.println(inputString.toUpperCase());
    }
}
