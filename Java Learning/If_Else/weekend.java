import java.util.Scanner;
class Weekends 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        String day;

        System.out.println("Enter a Day from Monday, Tuesday, Wednesday, Thursday Friday, Saturday, Sunday: ");
        day = sc.next();

        if(day.equals("Saturday") || day.equals("Sunday"))
        {
            System.out.println("It is a Weekend Day");
        }
        else
        {
            System.out.println("It is not a Weekend Day");
        }
    }
}
