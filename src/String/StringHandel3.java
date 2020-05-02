package String;

import java.util.Scanner;

public class StringHandel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = sc.nextLine();
        System.out.println("Replaced string with vowel : ");
        string = string.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(string);
    }
}
