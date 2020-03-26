import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(10);

        List list1 = list;
        System.out.println(list.size());

        list.remove(new Integer(10));

        System.out.print(list.size());

    }

}
