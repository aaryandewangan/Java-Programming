import java.util.Scanner;
class Vowels 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        char letter;

        System.out.print("Enter a Letter: ");
        letter = sc.next().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
        {
            System.out.println("It is a Vowel");
        }
        else
        {
            System.out.println("It is a Consonent");
        }
    }
}
