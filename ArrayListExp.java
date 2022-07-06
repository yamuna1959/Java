import java.util.*;
public class ArrayListExp
{
public static void main(String args[]) 
{
ArrayList<String>list=new ArrayList<String>( );
list.add("help"); 
list.add("welcome");
list.add("do");
list.add("sleep");
list.add("beep");
System.out.println(list);
System.out.println("Returning element:"+list.get(1)); 
list.set(1,"newly inserted");
System.out.println("List after insertion of:newly inserted");
for(String word:list)
System.out.println(word);
Collections.sort(list);
System.out.println("\nSorted list:");
for(String word:list)
System.out.println(word);
}
}
