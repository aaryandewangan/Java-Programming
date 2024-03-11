package Looping;
import java.util.*;

class reverintwodiff 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        int i;
        for(i=n; i>0; i--)
        {
            i=i-1;
            System.out.println(i+1);
        }
    }
}
