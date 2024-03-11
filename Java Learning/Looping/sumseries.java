package Looping;
import java.util.*;

class sumseries 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double n, sum=1.0;
        System.out.print("Enter the Length of series you want: ");
        n = sc.nextInt();

        int i;

        for(i=1; i<=n; i++)
        {
            sum=sum+(Math.pow(n,i)/i);
        }
        System.out.println("Sum of series is = "+sum);
    }
}
