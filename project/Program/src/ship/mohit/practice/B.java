package ship.mohit.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shipra on 4/5/18.
 */
public class B {
    static int a = 10;

    B() {
        System.out.println("=================B============");
    }


    B(int a) {

        System.out.println("=================PARAMETER============");
    }

    B(int a, int b) {
        System.out.println("=================PARAMETER============");
    }

    public static void add(int a) {
        System.out.print("B");
    }
}
