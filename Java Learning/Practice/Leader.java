package Practice;
import java.util.*;

class Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];
        System.out.print("Enter the array: ");

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(+arr[i]+" ");
        }
        System.out.println();

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    arr[i]=arr[j];
                    break;
                }
            }
        }
    }
}