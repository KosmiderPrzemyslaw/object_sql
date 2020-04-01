package c_Snippety;

import java.util.Scanner;

public class InputUtil {

    public static String askUser(String s) {
        System.out.print(s);

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int askForValidNumber(String s) {
        Scanner scanner = new Scanner(System.in);

        Integer number = null;
        do {
            System.out.print(s);
            String token = scanner.next();
            try {
                number = Integer.parseInt(token);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input - please type a number!");
            }
        } while (number == null);

        return number;
    }

}


