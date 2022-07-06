import java.util.HashSet;
public class HashSetComp
{
public static void main(String[] args) 
{
HashSet<Integer>hSet1 = new HashSet<Integer>();
hSet1.add(1);
hSet1.add(2);
hSet1.add(3);
System.out.println("First Hash Set : " + hSet1);
HashSet<Integer>hSet2 = new HashSet<Integer>();
hSet2.add(3);
hSet2.add(2);
hSet2.add(1);
System.out.println("Second Hash Set : "+ hSet2);
System.out.println("hSet1 . equals ( hSet2 )?" + hSet1.equals(hSet2));
hSet2.remove(2);
System.out.println("Second Hash Set after removing an element :"+ hSet2);
System.out.println("hSet1.equals ( hSet2 )? " + hSet1.equals (hSet2));
}
}
