package demo3;

public class PrintChar extends Thread{
	public void run() {
		for(int i=65;i<=74;i++) {
			System.out.println((char)(i));
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
