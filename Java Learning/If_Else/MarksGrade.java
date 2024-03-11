import java.util.Scanner;

class MarksGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, total;
        double per;
        System.out.print("Enter your Marks 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter your Marks 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter your Marks 3: ");
        m3 = sc.nextInt();
        System.out.print("Enter your Marks 4: ");
        m4 = sc.nextInt();

        total = m1+m2+m3+m4;
        per = total/4.0;

        if(per>=90)
        {
            System.out.println("GRADE A");
        }
        else if(per<90 && per>=80)
        {
            System.out.println("GRADE B");
        }
        else if(per<80 && per>=70)
        {
            System.out.println("GRADE C");
        }
        else if(per<70 && per>=60)
        {
            System.out.println("GRADE D");
        }
        else if(per<60 && per>=40)
        {
            System.out.println("GRADE E");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}