package Assignment;

import java.util.Scanner;

public class From1987to2013 {

    public static void main(String[] args) {

        int n;

        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        n++;

        while (!hasDistinctDigits(n)) {
            n++;
        }
        System.out.println(n);
    }

    // returns true if distinct
    public static boolean hasDistinctDigits(int n) {
        String s = String.valueOf(n);
        int[] number = new int[10];

        for (int i = 0; i < s.length(); i++) {
            int x = Integer.parseInt(s.substring(i, i + 1));
            number[x]++;
        }

        // check if any number occurred more than once
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 1) {
                return false;
            }
        }
        return true;
    }
}


