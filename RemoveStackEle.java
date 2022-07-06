import java.util.*;
public class RemoveStackEle
{
public static void main(String args[])
{
Stack<Integer>stack = new Stack<Integer>();
stack.add(-4);
stack.add(6);
stack.add(16);
stack.add(46);
stack.add(66);
stack.add(88);
System.out.println("Stack:" +stack);
int rem_ele =stack.remove(5);
System.out.println("Removed element:"+ rem_ele);
System.out.println("Final Stack :"+ stack);
}
}
