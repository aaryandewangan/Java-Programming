package Arrays;
import java.util.*;

class Student{
    int rollno[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mobno[] = new String[10];

    int i = 0;

    Scanner sc = new Scanner(System.in);

    public void inputData()
    {
        System.out.print("Enter Roll Number: ");
        rollno[i] = sc.nextInt();
        System.out.print("Enter Name: ");
        name[i] = sc.next();
        System.out.print("Enter City: ");
        city[i] = sc.next();
        System.out.print("Enter MobileNo: ");
        mobno[i] = sc.next();

        i++;
    }
    public void showData()
    {
        System.out.println("RollNo \t Name \t City \t MobNo");
        System.out.println("--------------------------------");

        for(int k=0; k<i; k++)
        {
            System.out.println(rollno[k]+"\t"+name[k]+"\t"+city[k]+"\t"+mobno[k]);
        }
    }
    public void updateData()
    {
        System.out.print("Enter Student Roll Number: ");
        int rno = sc.nextInt();
        for(int k=0; k<i; k++)
        {
            if(rno == rollno[k])
            {
                System.out.println("\n1. Name: "+name[k]+"\n"+"2. City: "+city[k]+"\n"+"3. Mobile Number: "+mobno[k]);
                System.out.print("\nSelect a Choice: ");
                int cho = sc.nextInt();

                switch(cho)
                {
                    case 1:
                        System.out.print("\nEnter New Name: ");
                        String name1 = sc.next();
                        name[k]=name1; 
                        System.out.println("Record Updated........");
                        break;
                    case 2:
                        System.out.print("\nEnter New City: ");
                        String city1 = sc.next();
                        city[k]=city1; 
                        System.out.print("Record Updated........");
                        break;
                    case 3:
                        System.out.print("\nEnter New Mobile Number: ");
                        String mobno1 = sc.next();
                        mobno[k]=mobno1; 
                        System.out.print("Record Updated........");
                        break;
                }
            }
        }
    }
    public void deleteData()
    {
        System.out.print("Enter your Roll number: ");
        int rno = sc.nextInt();
        for(int k=0; k<i; k++)
        {
            if(rno == rollno[k])
            {
                int temp = k;
                for(int j=k; j<i; j++)
                {
                    rollno[j] = rollno[j+1];
                    System.out.println("Record Deleted.........");
                    i--;
                }
            }
        }
    }
}
class main0{
    public static void main(String[] args) {
        Student s = new Student();
        while(true)
        {
            System.out.println("\n\n1. Input Data \n2. Display Data \n3. Update Data \n4. Delete Data \n5. Exit\n\n");

            System.out.print("Enter your Choice: ");
            int ch = new java.util.Scanner(System.in).nextInt();

            switch(ch)
            {
                case 1:
                    s.inputData();
                    break;
                case 2:
                    s.showData();
                    break;
                case 3:
                    s.updateData();
                    break;
                case 4:
                    s.deleteData();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}