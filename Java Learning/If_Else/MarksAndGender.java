import java.util.Scanner;
class GenderMarks 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int p1, p2, p3, total, per;
        char gender;
        System.out.print("Enter your Marks for Paper 1:");
        p1 = sc.nextInt();
        System.out.print("Enter your Marks for Paper 2:");
        p2 = sc.nextInt();
        System.out.print("Enter your Marks for Paper 3:");
        p3 = sc.nextInt();

        total = p1+p2+p3;
        per = (total/3);

        System.out.print("Enter your Gender(m/f):");
        gender = sc.next().charAt(0);

        if((per>=82 && gender == 'f') || (per>=65 && gender == 'm'))
        {
            System.out.println("Eligible for College");
        }
        else
        {
            System.out.println("Not Eligible for College");
        }
    }
}
