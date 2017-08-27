package Ch01_Introduction;

/**
 * Created by Ross on 27.08.2017.
 */
public class SortNumbers {
    public static void sort(double[] num) {
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

    public static void main(String[] args) {
        double[] num = new double[10];
        for (int i = 0; i <num.length ; i++) {
            num[i] = Math.random()*100;
        }
        sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
