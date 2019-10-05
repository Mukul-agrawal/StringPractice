package String;

import java.util.Scanner;

public class StringHandel10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char character = sc.nextLine().trim().charAt(0);
        System.out.println(inputString.indexOf(character));
        sc.close();
    }
}
