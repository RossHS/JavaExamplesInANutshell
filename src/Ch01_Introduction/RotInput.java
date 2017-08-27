package Ch01_Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ross on 27.08.2017.
 */
public class RotInput {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.print("> ");
            String line = in.readLine();
            if ((line == null) || line.equals("stop"))
                break;
            StringBuffer buffer = new StringBuffer(line);
            for (int i = 0; i < buffer.length(); i++) {
                buffer.setCharAt(i, rot(buffer.charAt(i)));
            }
            System.out.println(buffer);
        }
    }

    public static char rot(char c) {
        if ((c >= 'A') && (c <= 'Z')) {
            c += 13;
            if (c > 'Z') {
                c -= 26;
            }
        }

        if ((c >= 'a') && (c <= 'z')) {
            c += 13;
            if (c > 'z') {
                c -= 26;
            }
        }
        return c;
    }
}
