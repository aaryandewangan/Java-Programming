package Looping;
import java.util.Scanner;

class multiplicationofno
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int rem, n, mul=1;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n%10;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println("Multiplication of each Digit of the Number is "+mul);
    }
}