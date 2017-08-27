package Ch01_Introduction;

/**
 * Created by Ross on 27.08.2017.
 */
public class PrimeSort {
    public static void main(String[] args) {
        int max = 100;
        try {
            max = Integer.parseInt(args[0]);
        } catch (Exception e) {
        }

        boolean[] isPrime = new boolean[max + 1];
        for (int i = 0; i < max; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        int n = (int) Math.ceil(Math.sqrt(max));
        for (int i = 0; i <= n; i++) {
            if (isPrime[i])
                for (int j = 2 * i; j <= max; j += i) {
                    isPrime[j] = false;
                }

        }
        int largest;
        for (largest = max; !isPrime[largest]; largest--) ;
        System.out.println("Наибольшее простое число, не превосходящее " + max
                + " это " + largest);
    }
}
