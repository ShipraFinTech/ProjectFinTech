import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        String s = "aBCde";
        String string = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int a = chars[i];
            if (a >= 65 && a <= 90) {
                chars[i] = (char) (a + 32);
            } else if (a >= 97 && a <= 122) {
                chars[i] = (char) (a - 32);
            }
        }
        System.out.print("===============" + Arrays.toString(chars));

    }
}