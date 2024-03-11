package Looping;
import java.util.*;

class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);

        int n;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        int f0 = 0, f1 = 1, f2;

        System.out.print(f0+"\t"+f1);

        int i;
        for(i=3; i<=n; i++)
        {
            f2 = f0+f1;
            System.out.print("\t"+f2);
            f1=f0;
            f2=f1;
        }
    }
}
