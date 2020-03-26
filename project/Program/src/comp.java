import java.io.IOException;
import java.util.*;
import java.util.Comparator;

class test {

    public void sum() throws IOException

    {
        System.out.println("=========SHIPRA===========");
    }
}

public class comp extends Thread {

    public void run() {
        System.out.println("========RUnning============");
        throw new RuntimeException();

    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Collections.sort(list, (o1, o2) -> {
            if (o1.age > o2.age) {
               return 1;
            }else {
                return 0;
            }
        });
    }

}



