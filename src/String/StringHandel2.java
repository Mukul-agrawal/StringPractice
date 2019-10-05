package String;

import java.util.Scanner;

public class StringHandel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int indexValue = Integer.parseInt(scan.nextLine());
        System.out.println(string.substring(indexValue));
    }
}
