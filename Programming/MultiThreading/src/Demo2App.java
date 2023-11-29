
public class Demo2App {

	public static void main(String[] args) {
		Thread t2 = Thread.currentThread();
		System.out.println(t2);
		
		Demo2 t3 = new Demo2();
		t3.start();
		t3.setName("My Thread");
		t3.setPriority(7);
	}
}
