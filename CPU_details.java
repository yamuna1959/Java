class CPU
 {
    double Price;
    class Processor
      {
         double core;
         String manu;
         double getcache()
           {
             return 4.3;
           }
      }    
         protected class RAM  
           {
              double memory;
              String manu;
              double clockspeed()
                {
                   return 5.5;
                }
           }
 }
public class CPU_details  
  {
     public static void main(String args[])
      {
         CPU obj1=new CPU();
         CPU.Processor obj2=obj1.new Processor();
         CPU.RAM obj3=obj1.new RAM();
         System.out.println("Processor cache is "+obj2.getcache());
         System.out.println("RAM clockspeed is "+obj3.clockspeed());
      }   
  }              