package Practice;

import java.util.*;
class Pow {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    public  static void check(int n){
       int sum=1;
       int store=0;
        for(int i=0;i<n;++i){
           sum=sum*4;
            if(sum==n){
                System.out.println("square");
                break;
            }else{
                ++store;
            }

       }
        if(store == n ){
            System.out.println("not Square");
        }
    }
}