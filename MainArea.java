import java.util.Scanner;
interface Area
 {
   void area();
   void perimeter();
   void input();
 }
class Circle implements Area
 {
   int r=0;
   double pi=3.14,area=0,perimeter;
   public void input()
    {
      Scanner s=new Scanner(System.in);
      r=s.nextInt();
    }
   public void area()
    {
      area=pi*r*r;
      System.out.println("Area of circle"+area);
    }
   public void perimeter()
    {
      perimeter=2*pi*r;
      System.out.println("Perimeter of circle"+perimeter);
    }
 }
class Rectangle implements Area
 {
   int l=0,b=0;
   double area,perimeter;
   public void input()
    {
      Scanner sc=new Scanner(System.in);
      l=sc.nextInt();
      b=sc.nextInt();
    }
   public void area()
    {
      area=l*b;
      System.out.println("Area of rectangle"+area);
    }
   public void perimeter()
    {
      perimeter=2*(l+b);
      System.out.println("Perimeter of rectangle"+perimeter);
    }
 }
public class MainArea
 {
   public static void main(String[] args)
    {
      int ch;
      Circle c=new Circle();
      Rectangle r=new Rectangle();
      Scanner sc=new Scanner(System.in);
      System.out.println("1.Area of circle");
      System.out.println("2.Perimeter of circle");
      System.out.println("3.Area of rectangle");
      System.out.println("4.Perimeter of rectangle");
      System.out.println("5.Exit");
      l1:while(true)
       {
         System.out.println("Enter your choice");
         ch=sc.nextInt();
         switch(ch)
          {
            case 1:System.out.println("Enter radius of circle");
            c.input();
            c.area();
            break;
            case 2:System.out.println("Enter radius of circle");
            c.input();
            c.perimeter();
            break;
            case 3:System.out.println("Enter the length and breadth");
            r.input();
            r.area();
            break;
            case 4:System.out.println("Enter the length and breadth");
            r.input();
            r.perimeter();
            break;
            case 5:break l1;
            default:System.out.println("lnvalid choice");
          }
       }
    }
 }