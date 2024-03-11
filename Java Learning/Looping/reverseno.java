package Looping;
import java.util.Scanner;

class reverseno 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int rem, n, rev=0;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of is "+rev);
    }
}
