import java.util.*;
import java.util.Comparator;

public class shortMap {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("shipra", 21);
        hashMap.put("xytz", 23);
        hashMap.put("fffrf", 20);
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort(entryList, (o1, o2) -> {
            if (o1.getValue() < o2.getValue()) {
                return -1;
            } else if (o1.getValue() > o2.getValue()) {
                return 1;
            } else {
                return 0;
            }
        });
//        for (Map.Entry<String, Integer> entry : entryList) {
//
//            System.out.print("=========================ENTRY===========" + entry.getKey());
//            System.out.println("=========================VALUE===========" + entry.getValue());
//
//        }
        entryList.stream();

        entryList.forEach(entry -> {
            System.out.print("=========================ENTRY===========" + entry.getKey());
            System.out.println("=========================VALUE===========" + entry.getValue());
        });
    }
}
