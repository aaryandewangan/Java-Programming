import java.util.Scanner;

class ArithmaticOperation
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a, b, ch;
        double res;
        while(true)
        {
            System.out.print("Enter the Value of A: ");
            a = sc.nextInt();
            System.out.print("Enter the Value of B: ");
            b = sc.nextInt();
            
            System.out.println("CHOICES: \n 1. ADDITION \n 2. SUBTRACTION \n 3. MULTIPLICATION \n 4. DIVISION \n 0. EXIT");
            System.out.print("Enter your Choice: ");         
            ch = sc.nextInt();

            switch (ch) {
                 case 1:
                    res = a+b;
                    System.out.println("Addition: "+res);
                    break;
                 case 2:
                    res = a-b;
                    System.out.println("Subtraction: "+res);
                    break;
                 case 3:
                    res = a*b;
                    System.out.println("Multiplication: "+res);
                    break;
                 case 4:
                    res = a/b;
                    System.out.println("Division: "+res);
                    break;
                 case 0:
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("INVALID CHOICE ");
                    break;
            }
        }
    }
}