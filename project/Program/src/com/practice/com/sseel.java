package com.practice.com;

import com.dd.prac.help;

/**
 * Created by shipra on 17/4/18.
 */
public class sseel {

    public static void main(String args[]) {
        String st = "abcaac";
        Boolean flag = true;
        char[] array = st.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            int k = Math.abs(array[i]) - Math.abs(array[i + 1]);

            if (k == 0) {
                flag = false;
            }

        }
        if (flag) {
            System.out.print("==============STRING======");
        } else {
            System.out.print("===========NOT STRING======");
        }
    }
}
