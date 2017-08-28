package Ch01_Introduction;

/**
 * Created by Ross on 28.08.2017.
 */
public class Ex1_3 {
    public static void main(String[] args) {

        try {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            char[] ch = new char[num2 + 1 - num1];
            args[0].getChars(num1, num2 + 1, ch, 0);
            System.out.println(ch);
        } catch (NumberFormatException | StringIndexOutOfBoundsException |
                NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
