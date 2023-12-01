import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(100);
		ad.addLast(300);
		System.out.println(ad);
		ad.add(30);
		System.out.println(ad);//duplicates allowed
		//index values not present
	}
}
