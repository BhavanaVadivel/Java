package collections1;

import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap<>();
		m.put(1,11);
		m.put(2,new Student(4,"Abi",9.5));
		m.put("Three",300);
		m.put(4,"200");
		m.put("five",800);
		System.out.println(m);//order of insertion is preserved
	}
}
