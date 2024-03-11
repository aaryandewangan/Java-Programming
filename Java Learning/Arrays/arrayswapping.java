package Arrays;
import java.util.*;

class arrayswapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Length of Array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array elements: ");

        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp;
        for(int i=0, j=arr.length-1; i<j; i++, j--)
        {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
