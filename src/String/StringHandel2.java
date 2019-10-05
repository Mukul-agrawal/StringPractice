package String;

import java.util.Scanner;

public class StringHandel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int indexValue = Integer.parseInt(sc.nextLine());
        System.out.println(string.substring(indexValue));
    }
}
