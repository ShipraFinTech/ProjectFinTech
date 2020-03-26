package ship.mohit.practice;


public class A extends Exception{
    static int a = 20;
    private static A instance = null;

    private A() {
        System.out.println("============A==============");
    }


    A(int a, int b) {
        System.out.println("patananmb");
    }

    public static A getInstance(int a) {
        instance = new A();
        return instance;

    }

}


