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
        char[] digitsArr = new char[] {'0','1','2','3','4','5','6','7','8','9'};

        for (char value : digitsArr) {
            if (value == c) {return true;}
        }

        return false;
    }
}
