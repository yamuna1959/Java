import java.util.Scanner;
class EmployeeT
 {
   int Empid;
   String Name,Address;
   float Salary;
   
   EmployeeT()
    {
     
    }
   EmployeeT(int Empid,String Name,float Salary,String Address)
    {
      this.Empid=Empid;
      this.Name=Name;
      this.Salary=Salary;
      this.Address=Address;
    }
 }
class Teacher extends EmployeeT
 {
   String Dept,Subject;
   Teacher(int Empid,String Name,float Salary,String Address,String Dept,String Subject)
    {
      super(Empid,Name,Salary,Address);
      this.Dept=Dept;
      this.Subject=Subject;
    }
   public void display()
    {
      System.out.println("\nTeacher id\n"+Empid);
      System.out.println("\nTeacher name\n"+Name);
      System.out.println("\nTeacher salary\n"+Salary);
      System.out.println("\nTeacher address\n"+Address);
      System.out.println("\nTeacher departmet\n"+Dept);
      System.out.println("\nTeacher subject\n"+Subject);
    }
 }
public class Techarrays
 {
   public static void main(String args[])
    {
      System.out.println("Enter the number of teachers:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Enter teacher details one by one");
      Teacher tech[]=new Teacher[n];
      Scanner sc1=new Scanner(System.in);
      int tid;
      String name,address,depart,subject;
      float salary;
      for(int i=0;i<n;i++)
       {
         System.out.println("Enter the teacher id:");
         tid=sc1.nextInt();
         System.out.println("Enter the teacher name:");
         name=sc1.next();
         System.out.println("Enter the teacher salary:");
         salary=sc1.nextFloat();
         System.out.println("Enter the teacher address:");
         address=sc1.next();
         System.out.println("Enter the teacher department:");
         depart=sc1.next();
         System.out.println("Enter the teacher subject:");
         subject=sc1.next();
         Teacher t=new Teacher(tid,name,salary,address,depart,subject);
         tech[i]=t;
       }
      for(Teacher x:tech)
       {
         x.display();
         System.out.println("\n");
       }
    }
 }