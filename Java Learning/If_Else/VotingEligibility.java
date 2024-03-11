import java.util.Scanner;
class VotingEligibiility 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int age;
        System.out.print("Enter your Age:");
        age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Your are Eligible to Vote");
        }
        else
        {
            System.out.println("Your are NOT Eligible to Vote");
        }
    }
}
