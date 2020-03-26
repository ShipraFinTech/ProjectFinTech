
public class Palindrome {
    public static void main(String[] args) {
        String s = "sadtdas";
        reverse(s);
    }

    static void reverse(String name) {
        Boolean flag = true;
        for (int i = 0; i < name.length() / 2; i++) {
            char newname = name.charAt(name.length() - 1 - i);
            System.out.println("=================NAE========" + newname);
            if (name.charAt(i) != newname) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.print("===========NOT PALINDROME-----------");
        } else {
            System.out.print("=========== PALINDROME-----------");
        }
    }
}
