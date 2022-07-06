import java.io.*;
import java.util.*;
public class SetLinkedHasSet
{
public static void main(String[] args)
{
Set<String>hs = new LinkedHashSet<String>();
hs.add("hello");
hs.add("what");
hs.add("a");
hs.add("nice");
hs.add("sunny");
hs.add("day");
System.out.println(" Original Set :");
for(String s:hs )
System.out.print(s+ " , " );
System.out.println();
hs.clear();
System.out.println(" Set after clear(): " +hs);
}
}
