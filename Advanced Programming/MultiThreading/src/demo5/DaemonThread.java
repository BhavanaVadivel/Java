package demo5;

public class DaemonThread {

	public static void main(String[] args) {
		TypingCode t = new TypingCode();
		SavingCode s = new SavingCode();
		CompilingCode c = new CompilingCode();
		
		s.setDaemon(true);
		c.setDaemon(true);
		
		t.start();
		s.start();
		c.start();
	}

}
