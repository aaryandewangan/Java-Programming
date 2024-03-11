import java.util.Scanner;

class LeapYear
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int year;
        System.out.print("Enter a Year: ");
        year = sc.nextInt();

        if(year%100!=0)
        {
            if(year%4==0)
            {
                System.out.println("It is a Non Cneturian Leap Year !!");
            }
            else
            {
                System.out.println("It is a Not a Leap Year !!");
            }
        }
        if(year%400==0)
        {
            System.out.println("It is a Centurian Leap Year !!");
        }
    }
}