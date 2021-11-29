/*
* The reverse program.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-29-11
*
*/

import java.util.Scanner;

final class Reverse {

    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static String backWords(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return backWords(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter what you want reversed: ");
        str = scanner.nextLine();
        String reversed = backWords(str);
        System.out.println("The reversed string is: " + reversed + ".");
    }
}
