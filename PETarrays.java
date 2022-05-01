import java.util.Scanner;
class Person
 {
   String Name,Gender;
   int Age;
   
   Person()
    {
      
    }
   Person(String Name,String Gender,int Age)
    {
      this.Name=Name;
      this.Gender=Gender;
      this.Age=Age;
    }
 }
class Employee extends Person
 {
   int Empid; 
   String Cname,Qualif;
   float Salary;
   Employee(String Name,String Gender,int Age,int Empid,String Cname,String Qualif,float Salary)
    {
      super(Name,Gender,Age);
      this.Empid=Empid;
      this.Cname=Cname;
      this.Qualif=Qualif;
      this.Salary=Salary;
    }
 }
class Teacher extends Employee
 {
   int Tid;
   String Subject,Dept;
   Teacher(String Name,String Gender,int Age,int Empid,String Cname,String Qualif,float Salary,int Tid,String Subject,String Dept)
    {
      super(Name,Gender,Age,Empid,Cname,Qualif,Salary);
      this.Tid=Tid;
      this.Subject=Subject;
      this.Dept=Dept;
    }
   public void display()
    {
      System.out.println("\nEmployee name\n"+Name);
      System.out.println("\nEmployee gender\n"+Gender);
      System.out.println("\nEmployee age\n"+Age);
      System.out.println("\nEmployee id\n"+Empid);
      System.out.println("\nEmployee company name\n"+Cname);
      System.out.println("\nEmployee qualification\n"+Qualif);
      System.out.println("\nEmployee salary\n"+Salary);
      System.out.println("\nEmployee teacher_id\n"+Tid);
      System.out.println("\nEmployee subject\n"+Subject);
      System.out.println("\nTeacher department\n"+Dept);
    }
 }
public class PETarrays
 {
   public static void main(String args[])
    {
      System.out.println("Enter the number of employees:");
      Scanner S=new Scanner(System.in);
      int n=S.nextInt();
      System.out.println("Enter the employee details one by one\n");
      Teacher tech[]=new Teacher[n];
      Scanner S1=new Scanner(System.in);
      int age,empid,tid;
      String name,gender,cname,qualif,subject,dept;
      float salary;
      for(int i=0;i<n;i++)
       {
         System.out.println("Enter the employee name:");
         name=S1.next();
         System.out.println("Enter the employee gender:");
         gender=S1.next();
         System.out.println("Enter the employee age:");
         age=S1.nextInt();
         System.out.println("Enter the employee id:");
         empid=S1.nextInt();
         System.out.println("Enter the employee company name:");
         cname=S1.next();
         System.out.println("Enter the employee qualification:");
         qualif=S1.next();
         System.out.println("Enter the employee salary:");
         salary=S1.nextFloat();
         System.out.println("Enter the employee teacher id:");
         tid=S1.nextInt();
         System.out.println("Enter the employee subject:");
         subject=S1.next();
         System.out.println("Enter the employee department:");
         dept=S1.next();
         Teacher t=new Teacher(name,gender,age,empid,cname,qualif,salary,tid,subject,dept);
         tech[i]=t;
       }
      for(Teacher x:tech)
       {
         x.display();
         System.out.println("\n");
       }
    }
 }    