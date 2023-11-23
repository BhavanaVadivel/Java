import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet s = new TreeSet();
		s.add(100);
		s.add(200);
		s.add(300);
		// no heterogeneous data and no duplicate values(no error but not added)
		System.out.println(s);
	}
}
