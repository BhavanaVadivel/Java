package collectionsSorting;

import java.util.*;

public class CollectionSortingDemo {
public static void main(String[] args) {
	TreeSet<Integer> s = new TreeSet<>();
	s.add(75);
	s.add(63);
	s.add(8);
	s.add(725);
	System.out.println("Using Treeset "+s);
	
	ArrayList<Integer> l = new ArrayList<>();
	l.add(65);
	l.add(85);
	l.add(93);
	l.add(125);
	l.add(43);
	System.out.println("Before Sorting "+l);
	Collections.sort(l);
	System.out.println("After Sorting "+l);
}
}
