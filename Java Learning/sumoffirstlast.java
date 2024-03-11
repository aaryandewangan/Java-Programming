import java.util.Scanner;
class SumOfFirstandLast{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 Digit Number: ");
        int no=sc.nextInt();
        int n1=no%10;
        float n2=no/10000;
        float res=n1+n2;
        System.out.println("Sum of First and Last digit is:"+res);
    }
}