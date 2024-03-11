package Practice;
import java.util.*;

class convertStringStoT 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s, t;
        System.out.print("Enter String 1: ");
        s = sc.next();
        System.out.print("Enter String 2: ");
        t = sc.next();

        int len1 = s.length();
        int len2 = t.length();

        int count=0;
        if(len1>len2)
        {
            int x = len1-len2;
            System.out.println(x);
        }
        else if(len1<len2)
        {
            int x = len2-len1;
            System.out.println(x);
        }
        else if(len1 == len2)
        {
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
