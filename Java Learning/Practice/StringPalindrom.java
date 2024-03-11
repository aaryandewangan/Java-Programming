package Practice;

class StringPalindrom {
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);

        if(rev.equals(str)){
            System.out.println("String is a Palindrome.");
        }
        else{
            System.out.println("String is not Palindrome.");
        }
    }
}

