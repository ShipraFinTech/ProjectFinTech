import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class STringPrgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("shipra");
        list.add("manu");
        list.add("ayushi");
//        Collections.sort(list);
        System.out.print("========LIST=======" + list);
        list.forEach(name -> System.out.print("==============" + name));

        String arrayString[] = {"shipra", "mohit", "abc"};
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString.length - i; i++) {
                if (arrayString[j].charAt(0) < arrayString[j + 1].charAt(0)) {

                }
            }

        }
    }

}
