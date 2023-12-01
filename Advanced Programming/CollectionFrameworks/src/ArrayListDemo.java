import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		
		l1.add("goat");
		l1.add(true);
		l1.add('a');
		l1.add(200);
		l1.set(4, 500);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		ArrayList l2 = new ArrayList();
		l2.add(100);
		l2.add(200);
		l2.add(true);
		l2.add(100);
		l2.addAll(l1);
		System.out.println(l2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		l2.add(3,false);
		System.out.println(l2);
		System.out.println(l2.size());
		System.out.println("Index of "+l2.indexOf(100));
		System.out.println("Last Index of "+l2.lastIndexOf(100));
	}

}
