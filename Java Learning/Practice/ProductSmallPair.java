package Practice;
import java.util.*;

class ProductSmallPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter the Array: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        int diff = arr[1]-arr[0];

        int sum = 9;
        if(diff<sum)
        {
            int mul = arr[1]*arr[0];
            System.out.println(mul);
        }
        else{
            System.out.println("0");
        }
    }
}
