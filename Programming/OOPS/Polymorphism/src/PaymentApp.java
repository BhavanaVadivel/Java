
public class PaymentApp {

	public static void main(String[] args) {
		//TIGHTLY COUPLED....NON POLYMORPHIC CODE
		/*UPI u = new UPI();
		u.checkBalance();
		u.sendNotification();
		u.sendNotification();
		u.pay();
		System.out.println("============================================");
		Card c = new Card();
		c.checkBalance();
		c.sendNotification();
		c.sendNotification();
		c.pay();
		System.out.println("============================================");
		Wallet w = new Wallet();
		w.checkBalance();
		w.sendNotification();
		w.sendNotification();
		w.pay();
		//System.out.println("============================================");*/
		Payment ref;
		ref=new UPI();
		ref.checkBalance();
		ref.sendNotification();
		ref.sendNotification();
		((UPI) ref).pay();
		System.out.println("============================================");
		ref=new Card();
		ref.checkBalance();
		ref.sendNotification();
		ref.sendNotification();
		((Card) ref).pay();
		System.out.println("============================================");
		ref=new Wallet();
		ref.checkBalance();
		ref.sendNotification();
		ref.sendNotification();
		((Wallet) ref).pay();
		}
}
