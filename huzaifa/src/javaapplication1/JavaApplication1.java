package javaapplication1;
import java.util.Arrays;
public class JavaApplication1 {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        printArrayInReverse(integerArray);
        printArrayInReverse(doubleArray);
        printArrayInReverse(charArray);
    }
    public static <T> void printArrayInReverse(T[] array) {
        if (array != null && array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Empty array");
        }
    }
}