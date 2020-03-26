/**
 * Created by shipra on 26/3/18.
 */
public class Reverse {

    public static void main(String[] args) {
        int[] output = odd(3, 11);

        int len = output.length;

        for (int i = 0; i < len; i++) {
            System.out.print("------------------" + output[i]);
        }
    }

    public static int[] odd(int r, int l) {
        int index = 0;
        int limit = (l - r) / 2 + 1;

        int outut[] = new int[limit];

        for (int i = r; i <= l; i++) {
            if (i % 2 != 0) {
                outut[index] = i;
                index++;
            }
        }

        return outut;
    }
}
