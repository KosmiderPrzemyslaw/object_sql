package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.util.Scanner;

public class ScannerUtil {

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt())  {
            scanner.next();
            System.out.println("This is not an integer");
            System.out.println(prompt);
        }
        return scanner.nextInt();
    }
}


