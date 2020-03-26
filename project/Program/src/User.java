import java.io.IOException;

@FunctionalInterface
interface User {

    int a = 0;

    default int add(int a, int b) {
        System.out.print("=============SUM=============");
        return 10;
    }

    static void manipulation() {

    }


    int sum(int a, int b);


}


