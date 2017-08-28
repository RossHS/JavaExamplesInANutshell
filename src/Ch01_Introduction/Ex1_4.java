package Ch01_Introduction;

import java.util.Scanner;

/**
 * Created by Ross on 28.08.2017.
 */
public class Ex1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку (слово для выхода из цикла tiuq");
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("tiuq")) {
                break;
            }
            reverse(str);
            System.out.println();
        }
    }

    private static void reverse(String str) {
            for (int j = str.length() - 1; j >= 0; j--) {
                System.out.print(str.charAt(j));
        }
    }
}
