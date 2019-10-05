package String;

import java.util.Scanner;

public class StringHandel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        System.out.print("Index : ");
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n" + "Chars : ");
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(string1.charAt(i) + " ");
        }
    }
}
