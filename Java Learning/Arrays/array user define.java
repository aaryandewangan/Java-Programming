package Arrays;
import java.util.*;

class Arrayuserdefine {
    public static void main(String[] args) {
       int arr[] = new int[10];
       Scanner sc = new Scanner(System.in);
    
       int i;
       System.out.println("Enter the Array Elements: ");
       for(i=0; i<10; i++)
       {
           arr[i]=sc.nextInt();
       }

       for(i=0; i<=arr.length-1; i++)
       {
           System.out.println(arr[i]); 
       }
    }
}
