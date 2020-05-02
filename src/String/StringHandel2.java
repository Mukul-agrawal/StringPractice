package String;

import java.util.Scanner;

public class StringHandel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text : ");
        String string = sc.nextLine();
        System.out.println("Enter the index: ");
        int indexValue = Integer.parseInt(sc.nextLine());
        System.out.println(string.substring(indexValue));
    }
}
