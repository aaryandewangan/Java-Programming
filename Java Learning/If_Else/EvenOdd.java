import java.util.Scanner;
class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int n;
        System.out.print("Enter a Number:");
        n = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
