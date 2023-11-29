package demo5;

public class SavingCode extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Save code.....");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
