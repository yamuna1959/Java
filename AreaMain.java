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
public class AreaMain
 {
   public static void main(String[] args)
    {
      Circle c=new Circle();
      System.out.println("Enter the radius");
      c.input();
      c.area();
      c.perimeter();
      Rectangle r=new Rectangle();
      System.out.println("Enter the length and breadth");
      r.input();
      r.area();
      r.perimeter();
    }
 }