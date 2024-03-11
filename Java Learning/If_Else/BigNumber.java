import java.util.Scanner;

class BigNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter A:");
        a = sc.nextInt();
        System.out.print("Enter B:");
        b = sc.nextInt();
        System.out.print("Enter C:");
        c = sc.nextInt();

        if(a>b)
        {
            if (a>c)
            {
                System.out.println("Greatest Number is: " +a);
            }
            else
            {
                System.out.println("Greatest Number is: " +c);
            }
        }
        else if(b>c)
        {
            if (b>a)
            {
                System.out.println("Greatest Number is: " +b);
            }
            else
            {
                System.out.println("Greatest Number is: " +c);
            }
        }
    }
}