
public class Comparator implements java.util.Comparator {

    public int compare(Object object1, Object object2) {
        Student student = (Student) object1;
        Student student2 = (Student) object2;
        if (student.age > student2.age) {
            return 1;
        } else if (student.age < student2.age) {
            return -1;
        } else {
            return 0;
        }
    }

}
