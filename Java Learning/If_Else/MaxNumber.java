import java.util.Scanner;
class MaxNumber
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

        int max = n1;

        if(max<n2)
        {
            max=n2;
        }
        if(max<n3)
        {
            max=n3;
        }
        if(max<n4)
        {
            max=n4;
        }
        if(max<n5)
        {
            max=n5;
        }
        System.out.println("Maximum Number is: "+max);
    }
}
