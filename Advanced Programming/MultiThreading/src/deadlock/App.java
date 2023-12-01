package deadlock;

public class App {
	public static void main(String[] args) {

		PizzaHouse ph = new PizzaHouse();
		Baker b = new Baker(ph);
		Customer c = new Customer(ph);

		Thread t1 = new Thread();
		Thread t2 = new Thread();


	}
}
