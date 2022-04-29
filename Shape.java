import java.util.Scanner;
public class Shape
 {
   void calculatearea(float a)
    {
      System.out.println("\nArea of the square="+a*a);
    }
   void calculatearea(int l,int b)
    {
      System.out.println("\nArea of the rectangle="+l*b);
    }
   void calculatearea(double r)
    {
      double area=3.14*r*r;
      System.out.println("\nArea of the circle="+area);
    }
   public static void main(String[] args)
    {
      Shape obj=new Shape();
      System.out.println("\n\nEnter Side Of Square\n");
      Scanner sc=new Scanner(System.in);
      float side=sc.nextFloat();
      obj.calculatearea(side);
      System.out.println("\n\nEnter Radius\n");
      Scanner sc1=new Scanner(System.in);
      double rad=sc.nextDouble();
      obj.calculatearea(rad);
      System.out.println("\n\nEnter Side Of Rectangle\n");
      Scanner sc2=new Scanner(System.in);
      int side1=sc.nextInt();
      int side2=sc.nextInt();
      obj.calculatearea(side1,side2);
    }
 }
