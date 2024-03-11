import java.util.Scanner;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the Number:");
        n = sc.nextInt();

        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else if(n<0)
        {
            System.out.println("Negative Number");
        }
        else if(n==0)
        {
            System.out.println("Zero");
        }
    }
}