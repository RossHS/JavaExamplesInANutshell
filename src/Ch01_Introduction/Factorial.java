package Ch01_Introduction;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Ross on 27.08.2017.
 */
public class Factorial {
    public static int factorial(int x) {
        int fact = 1;
        if (x < 0) throw new IllegalArgumentException("x должен быть больше или равен 0");
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}

class FactorialWhile {
    public static int factorial(int x) {
        int fact = 1;
        if (x < 0) throw new IllegalArgumentException("x должен быть больше или равен 0");
        int i = 2;
        while (i <= x) {
            fact *= i;
            i++;
        }
        return fact;
    }
}

class FactorialRecursion {
    public static int factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть больше или равен 0");
        if (x <= 1) return 1;
        else return x * factorial(x - 1);
    }
}

class FactorialCash {
    static long[] table = new long[21]; //хранение факториалов от 0 до 20

    //Статический инициализатор
    static {
        table[0] = 1;
    }

    static int last = 0;

    public static long factorial(int x) throws IllegalArgumentException {
        if (x >= table.length) throw new IllegalArgumentException("Переполнение");
        if (x < 0) throw new IllegalArgumentException("x должен быть не отрицательным");
        while (last < x) {
            table[last + 1] = table[last] * (last + 1);
            last++;
        }
        return table[x];
    }
}

//Подходит для многопоточных программ.
class FactorialBigInteger {
    protected static ArrayList table = new ArrayList(); //создаем кэш

    static {
        table.add(BigInteger.valueOf(1)); // 0! = 1
    }

    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть не отрицательным");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastFact = (BigInteger) table.get(size - 1);
            BigInteger nextFact = lastFact.multiply(BigInteger.valueOf(size));
            table.add(nextFact);
        }
        return (BigInteger) table.get(x);
    }
}

class FactorialDEMO {
    public static void main(String[] args) {

        int factFOR = Factorial.factorial(5);
        int factWHILE = FactorialWhile.factorial(4);
        int factREC = FactorialRecursion.factorial(4);
        long factCASH = FactorialCash.factorial(10);
        BigInteger factBI = FactorialBigInteger.factorial(10);
        System.out.println("5! = " + factFOR);
        System.out.println("4! = " + factWHILE);
        System.out.println("4! = " + factREC);
        System.out.println("10! = " + factCASH);
        System.out.println("10! = " + factBI);
    }
}