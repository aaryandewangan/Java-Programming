import java.util.Scanner;

class SwitchVowel
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        char a;
            System.out.print("Enter a Character: ");
            a = sc.next().charAt(0);

            switch (a) {
                 case 'a':
                    System.out.println("Vowel ");
                    break;
                 case 'e':
                    System.out.println("Vowel ");
                    break;
                 case 'i':
                    System.out.println("Vowel ");
                    break;
                 case '0':
                    System.out.println("Vowel ");
                    break;
                 case 'u':
                    System.out.println("Vowel ");
                    break;
            
                default:
                    System.out.println("Component");
                    break;
        }
    }
}