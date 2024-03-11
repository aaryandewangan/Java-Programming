package Looping;
import java.util.Scanner;

class factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n, fact = 1;

        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        while(n>0)
        {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial = "+fact);
    }
}
