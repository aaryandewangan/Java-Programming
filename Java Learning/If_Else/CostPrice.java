import java.util.Scanner;

class CostPrice
{
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);

        double cp, dis, net;
        char stu;
        System.out.print("Enter the Cost Price: ");
        cp = sc.nextDouble();
        System.out.print("Are you a Studen(Y/N): ");
        stu = sc.next().charAt(0);

        if(stu=='y')
        {
            if(cp>500)
            {
                dis = 0.1*cp;
            }
            else
            {
                dis = 0.05*cp;
            }
        }
        else
        {
            if(cp>500)
            {
                dis = 0.08*cp;
            }
            else
            {
                dis = 0.02*cp;
            }
        }
        net = cp-dis;

        System.out.println("COST PRICE: "+cp);
        System.out.println("DISCOUNT: "+dis);
        System.out.println("NET COST PRICE: "+net);
    }
}