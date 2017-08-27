package Ch01_Introduction;

/**
 * Created by Ross on 27.08.2017.
 */
public class Reverse {
    public static void main(String[] args) {
        String[] str = {"Some", "small", "test"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.print(" ");
        }

        System.out.println();

        for (int i = str.length - 1; i >= 0; i--) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
