import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Collections;
import java.util.List;

/**
 * Created by shipra on 1/4/18.
 */
public class addString {
    public static void main(String[] args) {
        String s = "java is a programming language        ";
        String addString = "020";
        addNewString(s, addString);
    }

    public static void addNewString(String name, String addword) {
        int oldStringLenght = name.length();
        int addStringLenght = addword.length();
        char ch[] = name.toCharArray();
        String strings[] = name.split(" ");
        int newStringLenght = oldStringLenght + (strings.length - 1) * 2;
        System.out.print("======================" + newStringLenght);
        System.out.print("======================" + ch);
        ch[newStringLenght] = '\0';

//        for (int i = ch.length - 1; i >= 0; i--) {
//            if (ch[i] == ' ') {
//                ch[newStringLenght - 1] = '0';
//                ch[newStringLenght - 2] = '2';
//                ch[newStringLenght - 3] = '0';
//                newStringLenght = newStringLenght - 3;
//            } else {
//                ch[newStringLenght - 1] = ch[i];
//                newStringLenght = newStringLenght - 1;
//            }
//
//        }


    }

    public int addSum() {
        return 0;

    }
}

class Test1 extends addString {
    public int addSum() {
        return 0;
    }
}
