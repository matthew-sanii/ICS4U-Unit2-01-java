/*
* The reverse program.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-29-11
*
*/

import java.util.Scanner;

/**
* This is the reverse program.
*/

final class Reverse {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Randomly chooses what the computer will use in Rock Paper Scissors.
    *
    * @param str the user's input
    * @return the reversed string
    */

    public static String backWords(String str) {
        final String result;
        if (str.isEmpty()) {
            result = "";
        }
        else {
            result = backWords(str.substring(1)) + str.charAt(0);
        }
        return result;
    }

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str;
        System.out.println("Enter what you want reversed: ");
        str = scanner.nextLine();
        final String reversed = backWords(str);
        System.out.println("The reversed string is: " + reversed + ".");
    }
}
