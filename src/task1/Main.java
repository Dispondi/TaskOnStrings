package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();

        if (IsDigit(c[0])) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean IsDigit(char c) {
        boolean statement = Character.isAlphabetic(c);

        return !statement;
    }
}
