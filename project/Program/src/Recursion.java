/**
 * Created by shipra on 4/4/18.
 */
public class Recursion {

    static int a = 0, b = 1, c = 0;

    public static void main(String[] args) {
        int n = 10;
        System.out.print("==============" + a + "=======" + b);
        fib(n - 2);

    }

    public static void fib(int count) {
        if (count > 0) {
            System.out.println("===========COUNT===========" + count);
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
            fib(count - 1);
        }


    }
}
