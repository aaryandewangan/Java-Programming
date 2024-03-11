import java.util.Scanner;
class Marks 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int p1, p2, p3;
        System.out.print("Enter your Marks for Paper 1:");
        p1 = sc.nextInt();
        System.out.print("Enter your Marks for Paper 2:");
        p2 = sc.nextInt();
        System.out.print("Enter your Marks for Paper 3:");
        p3 = sc.nextInt();
        if(p1<45 && p2<45 && p3<45)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("PASS");
        }
    }
}
