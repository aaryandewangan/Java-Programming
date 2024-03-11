package Strings;

class StringReverse {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String s = new java.util.Scanner(System.in).next();

        System.out.println("Length = "+s.length());

        for(int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
