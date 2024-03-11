package Looping;
import java.util.Scanner;

class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n, rem, count=0;
        double arm = 0.0;

        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        int temp = n;
        int store = n;

        while(n>0)
        {
            n = n/10;
            count++; 
        }
        System.out.println("Number of Digits is = "+count);

        while(temp>0)
        {
            rem = temp%10;
            arm = arm + (Math.pow(rem,count));
            temp = temp/10;
        }
        System.out.println("Armstrong Sum = "+arm);
        if(store==arm)
        {
            System.out.println("It is an Armstrong Number");
        }
        else
        {
            System.out.println("It is not an Armstrong Number");
        }
    }
}