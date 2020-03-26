import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shipra on 11/4/18.
 */
public class SelectionSort {
    static int index = 0;
    static int[] array = {10, 2, 5, 8, 3, 9, 7};
    static int minimum = array[0];
    int a = 0;

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[4] = 5;
        for (int a = 0; a < arr.length; a++) {
            System.out.print("===============" + arr[a]);
        }
//        for (int i = 0; i < array.length; i++) {
//            minimum = array[i];
//            findMinimumNumber(i);
//            if (array[i] > minimum) {
//                int temp = array[i];
//                array[i] = minimum;
//                array[index] = temp;
//            }
//        }
//
//        System.out.print("=========ARRAYS========" + Arrays.toString(array));
    }

    public static void findMinimumNumber(int i) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < minimum) {
                minimum = array[j];
                index = j;
            }
        }
    }

}
