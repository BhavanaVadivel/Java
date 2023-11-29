package collections1;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap m = new TreeMap<>();
		m.put(1,500);
		m.put(2,new Student(4,"Anu",9.5));
		//m.put("Three",300);// ClassCastException
		m.put(4,"200");
		m.put(5,800);
		System.out.println(m);
		
	}

}
