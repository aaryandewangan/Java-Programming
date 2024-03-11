import java.util.Scanner;
class UserDefine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a:");
        int a=sc.nextInt();
        System.out.println("Enter the value for b:");
        int b=sc.nextInt();
        int res = a+b;
        System.out.println("Result for the Addition of "+a+" and "+b+" is: "+res);
    }
}