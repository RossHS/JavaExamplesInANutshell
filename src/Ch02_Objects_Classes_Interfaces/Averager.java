package Ch02_Objects_Classes_Interfaces;

/**
 * Created by Ross on 01.09.2017.
 */
public class Averager {
    private int n = 0;
    private double sum = 0, sumOfSquares = 0;

    public void addDatum(double x) {
        n++;
        sum += x;
        sumOfSquares += x * x;
    }

    public double getAverage() {
        return sum / n;
    }

    public double getStandardDeviation() {
        return Math.sqrt(((sumOfSquares - sum * sum / n) / n));
    }

    public double getNum() {
        return n;
    }

    public double getSum() {
        return sum;
    }

    public double getSumOfSquares() {
        return sumOfSquares;
    }

    public void reset() {
        n = 0;
        sum = 0;
        sumOfSquares = 0;
    }

    public static class Test {
        public static void main(String[] args) {
            Averager a = new Averager();
            for (int i = 1; i <= 100; i++) {
                a.addDatum(i);
            }
            System.out.println("Среднее: " + a.getAverage());
            System.out.println("Стандартное отклонение: " + a.getStandardDeviation());
            System.out.println("N: " + a.getNum());
            System.out.println("Сумма: " + a.getSum());
            System.out.println("Сумма квадратов: " + a.getSumOfSquares());
        }
    }
}
