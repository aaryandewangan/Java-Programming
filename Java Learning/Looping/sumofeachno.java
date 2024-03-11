package Looping;
import java.util.Scanner;

class sumofeachno
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int rem, n, sum=0;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of each Digit of the Number is "+sum);
    }
}
