
public class Min {

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int integerArray[] = {10, 20, 50, 40, 30, 5, 15, 60};
        min = integerArray[0];
        for (int i = 1; i < integerArray.length; i++) {
            if (min > integerArray[i]) {
                min = integerArray[i];
            } else if (max < integerArray[i]) {
                max = integerArray[i];
            }
        }
        System.out.println("==========MIN=========" + min);
        System.out.println("==========MAX========" + max);
    }

}
