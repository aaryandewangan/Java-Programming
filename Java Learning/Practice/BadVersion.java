package Practice;

import java.util.Scanner;

 class QuestionOne {
    static int i;
    static int b;
     void isBadVersion(){
        while(i>0){
            if(b>i){
                System.out.println("The Version "+i+" is False");
            }
            else{
                System.out.println("The version "+i+" is True");
            }
            --i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the version input : ");
         i = sc.nextInt();

        System.out.print("Enter the bad input : ");
         b = sc.nextInt();

         QuestionOne obj = new QuestionOne();
         obj.isBadVersion();
        
    }
}