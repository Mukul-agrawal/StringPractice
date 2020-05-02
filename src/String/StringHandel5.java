package String;

import java.util.Scanner;

public class StringHandel5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine().trim();
        System.out.println("Enter substring to be replaced by new string :");
        String subString = sc.nextLine().trim();
        System.out.println("Enter new string : ");
        String replace = sc.nextLine().trim();
        inputString = inputString.replaceAll(subString, replace);
        System.out.println("output :");
        System.out.println(inputString);
        sc.close();
    }
}
