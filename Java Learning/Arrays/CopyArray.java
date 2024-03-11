package Arrays;
import java.util.*;

public class CopyArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 3, 4, 5};
        int arr2[] = Arrays.copyOf(arr1,5);

        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[10];
        System.arraycopy(arr2, 0, arr3, 0, 5);
        System.out.println(Arrays.toString(arr3));
    }
}
