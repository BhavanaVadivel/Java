
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
		
	LinkedList l1 = new LinkedList();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	System.out.println(l1);
	
	l1.add("goat");
	l1.add(true);
	l1.add('a');
	l1.set(3, 500);
	System.out.println(l1);
	System.out.println(l1.size());
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	
	LinkedList l2 = new LinkedList();
	l2.add(100);
	l2.add(true);
	l2.add(100);
	l1.addAll(l2);
	System.out.println(l2);
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	
	l2.add(3,false);
	System.out.println(l2);
	System.out.println(l2.size());
	System.out.println("Index of "+l2.indexOf(100));
	System.out.println("Last Index of "+l2.lastIndexOf(100));
}
}
