package PracticeTwo;

import java.util.*;

class Employee
{
    double salary;
    public Employee(int sal)
    {
        salary = sal;
    }

    public void work()
    {
        System.out.println("Employee is working on ChatBot......");
    }

    public void getSalary()
    {
        System.out.println("Salary is: "+salary);
    }
}

class HRManager extends Employee
{
    String ename, eid, city;
    Scanner sc = new Scanner(System.in);

    public HRManager()
    {
        super(40000);
    }

    public void work()
    {
        System.out.println("Employee is Resting.......");
    }

    public void getEmployee()
    {
        System.out.print("Enter Employee Name: ");
        ename = sc.next();
        System.out.print("Enter Employee ID: ");
        eid = sc.next();
        System.out.print("Enter Employee City: ");
        city = sc.next();
    }

    public void showEmployee()
    {
        System.out.print("Name: "+ename);
        System.out.print("ID: "+eid);
        System.out.print("City: "+city);
        System.out.print("Salary: "+salary);
    }
}