package Ch01_Introduction;

import java.util.Scanner;

/**
 * Created by Ross on 28.08.2017.
 */
public class Ex1_5 {
    private static void sort(double[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i; j < num.length; j++) {
                if (num[j] < num[min])
                    min = j;
            }
            double tmp;
            tmp = num[i];
            num[i] = num[min];
            num[min] = tmp;
        }
    }

    private static void numPlace(double[] num, double userNum) {
        for (int i = 0; i < num.length - 1; i++) {
            if (userNum > num[i] && userNum < num[i + 1]) {
                System.out.println(userNum + " больше " + num[i] + " и меньше " + num[i + 1]);
            }
        }
        if (userNum > num[num.length - 1]){
            System.out.println(userNum + " больше всех элементов массива");
        }
        if (userNum < num[0]){
            System.out.println(userNum + " меньше всех элементов массива");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.random() * 100;
        }
        sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        while (true) {
            double userNum = scanner.nextDouble();
            if (userNum == 0) break;
            numPlace(num, userNum);
        }
    }
}
