import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by shipra on 7/3/18.
 */
public class Student implements Comparable {

    int a = 20;
    String name;
    int age;

    Student() {

    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(int a) {
        this.a = a;
        System.out.print(a);
    }

    public int compareTo(Object object) {
        Student student = (Student) object;
        if (age > student.age) {
            return 1;
        } else if (age < student.age) {
            return -1;
        } else {
            return 0;
        }
    }

    void sum() {
        System.out.print("=========SHIPRA=============");
    }

    void sub() {
        System.out.print("===========HJHJhjhjhjhj");
    }

}
