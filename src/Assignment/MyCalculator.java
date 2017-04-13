package Assignment;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

    // @Override
    public int divisorSum(int n) {
        int divisorSum = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorSum += i;
            }
        }

        return divisorSum;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        MyCalculator mc = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(mc.divisorSum(input));

    }

}
