import java.io.IOException;
import java.util.Scanner;
class MyExcep extends Exception
  {
     public MyExcep(String str)
       {
          System.out.println(str);
       }
  }
public class SignException
  {
     public static void main(String[] args)throws IOException
       {
          System.out.println("Enter number of input numbers::");
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int k=0,sum=0;
          Integer mynumber[]=new Integer[n];
          while(n>0)
            {
               try
                {
                   System.out.println("Enter number::");
                   int num=sc.nextInt();
                   if(num<0)
                   throw new MyExcep("Number is negative");
                   else
                     {
                        mynumber[k]=num;
                        sum=sum+num;
                        k++;
                     }
                    n--;
                }
               catch(MyExcep m)
                {
                     System.out.println(m);
                }
            }  
          System.out.println("The average is"+sum/k);
       }
  }   
             