package ship.mohit.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by shipra on 4/5/18.
 */
public class test {

    public static void main(String[] args) {
        String[] shortArray = {"abc", "shipra", "tayak"};
        Arrays.sort(shortArray, new CompareClass());
    }

}

class CompareClass implements Comparator {

    public int compare(Object object1, Object object2) {

    }
}
