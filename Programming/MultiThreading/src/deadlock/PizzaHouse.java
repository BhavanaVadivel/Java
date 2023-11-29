package deadlock;

public class PizzaHouse {
	
	int token;

	public void bake(int num) {
		token = num;
		System.out.println("baker is baking "+token);
	}
	public void eat() {
		System.out.println("Customer is eating "+token);
	}
}
