package collections1;

import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put(1,500);
		m.put(2,new Student(4,"Anu",9.5));
		m.put("Three",300);
		m.put(4,"200");
		m.put("five",800);
		System.out.println(m);//order of insertion not followed
	}
}
