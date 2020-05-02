package String;

import java.util.Scanner;

public class StringHandel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text : ");
        String string = sc.nextLine();
        System.out.println("Replaced text with vowel : ");
        string = string.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(string);
    }
}
