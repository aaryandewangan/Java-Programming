import java.util.Scanner;

class CharCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char ch;
        System.out.print("Enter a Character: ");
        ch = sc.next().charAt(0);

        if(ch>=65 && ch<=90)
        {
            System.out.println("UPPERCASE");
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.println("LOWERCASE");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println("DIGIT");
        }
        else
        {
            System.out.println("SPECIAL CHARACTER");
        }
    }
}