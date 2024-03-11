import java.util.Scanner;
class MinNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, n5;
        System.out.print("Enter a N1: ");
        n1 = sc.nextInt();
        System.out.print("Enter a N2: ");
        n2 = sc.nextInt();
        System.out.print("Enter a N3: ");
        n3 = sc.nextInt();
        System.out.print("Enter a N4: ");
        n4 = sc.nextInt();
        System.out.print("Enter a N5: ");
        n5 = sc.nextInt();

        int min = n1;

        if(min>n2)
        {
            min=n2;
        }
        if(min>n3)
        {
            min=n3;
        }
        if(min>n4)
        {
            min=n4;
        }
        if(min>n5)
        {
            min=n5;
        }
        System.out.println("Minimum Number is: "+min);
    }
}