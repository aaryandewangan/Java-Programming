package Looping;
import java.util.Scanner;

class count 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n, count=0;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Counting of this Number is "+count);
    }
}
