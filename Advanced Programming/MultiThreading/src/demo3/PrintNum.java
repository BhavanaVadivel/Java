package demo3;

public class PrintNum extends Thread{
	public void run() {

		for(int i=1;i<=10;i++) {
			System.out.println("Numbers = "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
