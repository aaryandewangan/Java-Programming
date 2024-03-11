package Looping;
import java.util.*;

class sumseriesfactorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        double n, sum=1.0;
        System.out.print("Enter the Length of series you want: ");
        n = sc.nextInt();
        double temp = n;

        int i;
        double fact = 1.0;

        for(i=1; i<=temp; i++)
        {
            fact = fact * i;
            sum=sum+(Math.pow(temp,i)/fact);
        }
        System.out.println("Sum of series is = "+sum);
    }
}
