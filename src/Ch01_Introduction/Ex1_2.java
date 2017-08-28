package Ch01_Introduction;

/**
 * Created by Ross on 28.08.2017.
 */
public class Ex1_2 {
    public static void main(String[] args) {
        int n0 = 0, n1 = 1, n2 = 1, n3;
        System.out.print(n0 + " " + n1 + " " + n2 + " ");
        for (int i = 0; i < 17; i++) {
            n3 = n0 + n1 + n2;
            System.out.print(n3 + " ");
            n0 = n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
