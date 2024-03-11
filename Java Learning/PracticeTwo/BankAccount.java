package PracticeTwo;
import java.util.*;

class BankAccount {
    String name;
    String accno;
    String mobno;
    long amt;
    static long bal;
    Scanner sc = new Scanner(System.in);
    public BankAccount(){
        bal = 1000;
    }
    public void inputData()
    {
        System.out.println("Enter your Name: ");
        name = sc.next();
        System.out.println("Enter Account Number: ");
        accno = sc.next();
        System.out.println("Enter Mobile Number: ");
        mobno = sc.next();
    }

    public void displayData()
    {
        System.out.println("-----------DETAILS-----------");
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accno);
        System.out.println("Mobile Number: "+mobno);
        System.out.println("Balance: "+bal);
        System.out.println("-----------------------------");
    }

    public void deposit()
    {
        System.out.println("Enter the amount you want to Deposit: ");
        amt = sc.nextLong();
        bal = bal+amt;
        System.out.println("New Balance: "+bal);
    }
    public void withdraw()
    {
        System.out.println("Enter the amount you want to Withdraw: ");
        amt = sc.nextLong();
        bal = bal-amt;
        System.out.println("New Balance: "+bal);
    }
}

class SavingsAccount extends BankAccount
    {
        public void withdraw()
        {
            System.out.println("Enter the amount you want to Withdraw: ");
            amt = sc.nextLong();
            if(bal-amt<1000)
            {
                System.out.println("Cant't Withdraw, ERROR: Amount below 1000");
            }
            else{
                bal = bal-amt;
                System.out.println("New Balance: "+bal);
            }
        }
    }
class BankAccountMain{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        SavingsAccount obj1 = new SavingsAccount();

        Scanner sc1 = new Scanner(System.in);

        while(true)
        {
            System.out.println("CHOICES - \n 1. Input Data \n 2. Display Data \n 3. Deposit \n 4. Withdraw \n 5. Saving Withdraw \n 6. Exit");
            System.out.println("Enter your Choice: ");
            int ch = sc1.nextInt();
            switch(ch)
            {
                case 1:
                   obj.inputData();
                   break;
                case 2:
                   obj.displayData();
                   break;
                case 3:
                   obj.deposit();
                   break;
                case 4:
                   obj.withdraw();
                   break;
                case 5:
                   obj1.withdraw();
                   break;
                case 6:
                   System.exit(0);
                   break;
            }
        }
    }
}
