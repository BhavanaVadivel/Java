import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		//pq.add("Ten");//error - CkassCastException
		//to avoid that Exception - <String> or <Integer> ...
		System.out.println(pq);
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		pq2.add(50);
		pq2.add(60);
		pq2.add(60);
		pq.addAll(pq2);
		System.out.println(pq);
		
		PriorityQueue<String> pq3 = new PriorityQueue<String>();
		pq3.add("One");
		pq3.add("Two");
		pq3.add("Three");
		//pq3.addAll(pq2);--->Error
		System.out.println(pq3);
	}

}
