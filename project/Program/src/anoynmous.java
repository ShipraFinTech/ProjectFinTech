import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by shipra on 6/4/18.
 */
public class anoynmous implements Runnable {

    public anoynmous() {

    }

    public void run() {
        System.out.print("================SHIPRA");
    }

    public static void main(String[] args) {
        int k = 5;
        System.out.println(getBoolean() ? k = 3 * k++ : k++ + ++k);
    }

    public static boolean getBoolean() {
        if ((int) (Math.random() * 3) == 0)
            return false;
        else
            return true;
    }
}

class Test extends anoynmous {

}
