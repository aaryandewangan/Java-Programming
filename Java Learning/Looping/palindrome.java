package Looping;
import java.util.Scanner;

class Palindrom 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n, rem, rev=0;

        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        int temp = n;

        while(n>0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(temp==rev)
        {
            System.out.println("It is an Palindrom Number");
        }
        else
        {
            System.out.println("It is not an Palindrom Number");
        }
    }
}