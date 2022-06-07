import java.util.Scanner;
import java.util.Arrays;
class Employee
 {
   int eno,esalary;
   String ename;
   public Employee()
    {
      
    }
   public Employee(int no,int sal,String name)
    {
      eno=no;
      esalary=sal;
      ename=name;
    }
   public void showData()
    {
      System.out.println("EMPID="+eno);
      System.out.println("NAME="+ename);
      System.out.println("salary="+esalary);
      System.out.println();
    }
 }
public class Employee1
 {
   public static void main(String[]args)
    {
      System.out.println("Enter no of employee");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Enter employee details one by one\n");
      Employee employees[]=new Employee[n];
      Scanner sc_emp=new Scanner(System.in);
      int eid,esal;
      String ename;
      for(int i=0;i<n;i++)
       {
         System.out.println("Enter"+i+"employee details\n");
         System.out.println("Enter employee id(integer):\n");
         eid=sc_emp.nextInt();
         System.out.println("Enter employee name(String)\n");
         String nam=sc_emp.next();
         ename=new String(nam);
         System.out.println("Enter employee salary(integer)\n");
         esal=sc_emp.nextInt();
         Employee emp=new Employee(eid,esal,ename);
         employees[i]=emp;
       }
      System.out.println("Employee are:\n");
      for(Employee y:employees)
      y.showData();
      System.out.println("Enter employee no to search:\n");
      int semp=sc.nextInt();
      boolean found=false;
      for(Employee e:employees)
       {
         if(semp==e.eno)
           {
             found=true;
             System.out.println("Employee found");
             e.showData();
             break;
           }
       }
      if(!found)
       {
         System.out.println("employee not found");
       }
    }
 } 