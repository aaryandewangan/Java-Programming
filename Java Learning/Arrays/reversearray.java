package Arrays;
import java.util.*;

class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int [5];

        System.out.println("Enter the Array Elements: ");

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0, j = arr.length-1; i <= arr.length-1; i++,j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
