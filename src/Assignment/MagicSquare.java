package Assignment;

import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {

        int side = 4;
        int i, j, sumRow, sumCol, sum = 0;
        boolean magic = true;

        int[][] square = new int[side][side];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 16 numbers: ");
        for(i=0; i<side; i++) {
            for(j=0; j<side; j++) {
                square[i][j] = input.nextInt();
            }
        }

        System.out.println("Square: ");
        for(i=0; i<side; i++) {
            for(j=0; j<side; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }


        for(j=0; j<side; j++) {
            sum += square[0][j];
        }

        for(i=0; i<side; i++) {
            sumRow = 0;
            for(j=0; j<side; j++) {
                sumRow += square[i][j];
            }
            if(sumRow != sum) {
                magic = false;
                break;
            }
        }

        if(magic) {
            for(j=0; j<side; j++) {
                sumCol = 0;
                for(i=0; i<side; i++) {
                    sumCol += square[i][j];
                }
                if(sumCol != sum) {
                    magic = false;
                    break;
                }
            }
        }

        if(magic) {
            System.out.println("It's a magic square!");
        } else {
            System.out.println("It's NOT a magic square...");
        }



    }
}
