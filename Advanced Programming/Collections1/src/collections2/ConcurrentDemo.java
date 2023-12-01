package collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo {
	public static void main(String[] args) {
		//ArrayList l = new ArrayList<>();
		CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);

		//concurrent modification using for loop (Infinite loop)
		int temp = 40;
		/*for (int i=0;i<l.size()-1;i++) {
		System.out.println(l.get(i));//reading
		l.add(temp);//writing
		temp+=10;
	}

	//concurrent modification using foreach loop (ConcurrentModificationException)
	for (Object i : l) {
		System.out.println(i+" ");//reading
		l.add(temp+=10);//writing
	}*/
		//Concurrent modification using iterator
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
			l.add(temp+=10);
		}
		
	}
}
