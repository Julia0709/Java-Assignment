package Assignment;

import java.util.Scanner;

public class RoVarspraKet {

    public static void main(String[] args) {

        String input, output = "";
        int i;

        // scanner
        System.out.println("Enter a word: ");
        Scanner in = new Scanner(System.in);
        input = in.nextLine();

        for (i = 0; i < input.length(); i++){
            switch (input.substring(i,i+1)) {
                // vowel
                case "a":
                    output += "a";
                    break;
                case "e":
                    output += "e";
                    break;
                case "i":
                    output += "i";
                    break;
                case "o":
                    output += "o";
                    break;
                case "u":
                    output += "u";
                    break;

                // exception "z"
                case "z":
                    output += "z";
                    break;

                // consonant
                case "b":
                    output += "bac";
                    break;
                case "c":
                    output += "cad";
                    break;
                case "d":
                    output += "def";
                    break;
                case "f":
                    output += "deg";
                    break;
                case "g":
                    output += "gih";
                    break;
                case "h":
                    output += "hij";
                    break;
                case "j":
                    output += "jik";
                    break;
                case "k":
                    output += "kil";
                    break;
                case "l":
                    output += "lim";
                    break;
                case "m":
                    output += "mon";
                    break;
                case "n":
                    output += "nop";
                    break;
                case "p":
                    output += "poq";
                    break;
                case "q":
                    output += "qor";
                    break;
                case "r":
                    output += "ros";
                    break;
                case "s":
                    output += "sut";
                    break;
                case "t":
                    output += "tuv";
                    break;
                case "v":
                    output += "vuw";
                    break;
                case "w":
                    output += "wux";
                    break;
                case "x":
                    output += "xuy";
                    break;
                case "y":
                    output += "yuz";
                    break;
            }
        }

        // result
        System.out.println("Input word: " + input);
        System.out.println("Output word: " + output);

    }
}