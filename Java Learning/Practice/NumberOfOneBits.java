package Practice;
import java.util.*;

public class NumberOfOneBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n;
        System.out.print("Enter Input: ");
        n = sc.next();
        
        char str[] = n.toCharArray();
        int x=0;

        if(str.length == 32)
        {
            for(int i=0; i<str.length; i++)
            {
                if(str[i] == '1')
                {
                    x++;
                }
                System.out.println("It is a 32-Bit Input");
            }

            System.out.println("Number of 1's in the Input: "+x);
        }
        else
        {
            System.out.println("NOT a 32-Bit Input");
        }
    }
}