package Ch01_Introduction;

import java.util.Scanner;

/**
 * Created by Ross on 27.08.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число, до которого следует найти числа Фибоначчи: ");
        int maxnum = scanner.nextInt();
        System.out.println();
        int num0 = 1, num1 = 1, num2;
        System.out.print(num0 + " " + num1);
        while (true) {
            num2 = num0 + num1;
            if (num2 > maxnum) {
                break;
            }
            System.out.print(" " + num2);
            num0 = num1;
            num1 = num2;
        }
    }
}
