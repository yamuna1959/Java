import java.util.Scanner;
class UsernameE extends Exception
 {
    public UsernameE(String msg)
      {
         super(msg);
      }
 }
class PasswordE extends Exception
 {
    public PasswordE(String msg)
     {
        super(msg);
     }
 }
public class Check
  {
     public static void main(String[] args)
      {
         Scanner s=new Scanner(System.in);
         String username,password;
         System.out.println("Enter username:");
         username=s.nextLine();
         System.out.println("Enter password:");
         password=s.nextLine();
         int length=username.length();
         try
          {
             if(length<6)
             throw new UsernameE("Username must be greater than 6 characters");
             else if(!password.equals("hello"))
             throw new PasswordE("Incorrect password\n Type correct password");
             else
             System.out.println("Login Successfull");
          }
        catch(UsernameE u)
         {
            u.printStackTrace();
         }
       catch(PasswordE p)
         {
            p.printStackTrace();
         }
       finally
         {
            System.out.println("The final statement is executed");
         }
      }
  }