package Abstract;
import java.util.*;

abstract class BankAccount {
    String name;
    String accno;
    String mobno;
    long amt;
    static long bal;

    abstract public void deposit();
    abstract public void withdraw();

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
}

class SavingAccount extends BankAccount
{
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
class CurrentAccount extends SavingAccount
    {
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
class BankAbstract{
    public static void main(String[] args) {
        SavingAccount obj1 = new SavingAccount();
        CurrentAccount obj2 = new CurrentAccount();

        Scanner sc1 = new Scanner(System.in);

        while(true)
        {
            System.out.println("CHOICES - \n 1. Input Data \n 2. Display Data \n 3. Saving Account Deposit \n 4. Saving Account Withdraw \n 5. Current Account Deposit \n 6. Current Account Withdraw \n 7. Exit");
            System.out.println("Enter your Choice: ");
            int ch = sc1.nextInt();
            switch(ch)
            {
                case 1:
                   obj1.inputData();
                   break;
                case 2:
                   obj1.displayData();
                   break;
                case 3:
                   obj1.deposit();
                   break;
                case 4:
                   obj1.withdraw();
                   break;
                case 5:
                   obj2.deposit();
                   break;
                case 6:
                   obj2.withdraw();
                   break;
                case 7:
                   System.exit(0);
            }
        }
    }
}