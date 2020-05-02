package String;

import java.util.Scanner;

public class StringHandel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = sc.nextLine();
        System.out.println("Enter the index: ");
        int indexValue = Integer.parseInt(sc.nextLine());
        System.out.println("output :");
        System.out.println(string.substring(indexValue));
    }
}
