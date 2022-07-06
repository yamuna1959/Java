public class StringManipulation1
{
public static void main(String[] args)
{

System.out.println("\n \nCreating Strings");
char arrSample[]={'R', 'O','S','E'};
String str1=new String(arrSample);
System.out.println("\n Created_from array using_new_String:"+str1);

byte ascii[]={65,66,67,68,69,70};
String str2=new String(ascii);
System.out.println("\n Created from byte[]:"+str2);

System.out.println("\nString_length");
System.out.println("\n Length of " +str1+"  is  "+str1.length());

System.out.println("\nString_concatenation");

String str3=str1.concat(str2);
System.out.println("\n using concat(): "+str3);

String str4=str1+str2;
System.out.println("\n using + operator: "+str4);


System.out.println("\n****String comparison****");
System.out.println("\n \n USING COMPARETO");

String str_Sample="RockStar";
System.out.println("\n Compare RockStar  To ROCKSTAR: "+str_Sample.compareTo("ROCKSTAR"));
System.out.println("\n Compare 'RockStar' To 'ROCKSTAR' Case ignored:"+str_Sample.compareToIgnoreCase("ROCKSTAR"));

System.out.println("\n \n #USING EQUALS#");
System.out.println("\n 'RockStar' equals('ROCKSTAR') is:  **************"+str_Sample.equals("ROCKSTAR"));
System.out.println("\n'RockStar' equals('ROCKSTAR')is if Case Ignored:**********"+str_Sample.equalsIgnoreCase("ROCKSTAR"));


System.out.println("\n \n ######USING INDEXOF######");
System.out.println("\n indexof t in 'RockStar' is:"+str_Sample.indexOf("t"));
System.out.println("\n indexof 'Star' in 'RockStar' is:"+str_Sample.indexOf("Star"));


System.out.println("\n****Modifying  a  string****");
System.out.println("\n changing case of chaacters in the string");
System.out.println("\n All caps 'RockStar': "+str_Sample.toUpperCase());
System.out.println("\n All small 'RockStar':"+str_Sample.toLowerCase());

System.out.println("\n \n  ######USING REPLACE######");
System.out.println("\n In 'RockStar' replace 'Star' with 'et'"+str_Sample.replace("Star","et"));
}
}
