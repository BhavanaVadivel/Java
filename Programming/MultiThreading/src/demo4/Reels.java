package demo4;

public class Reels extends Thread{
	public void run() {
		try {
			System.out.println("Creating a reel...");
			Thread.sleep(2000);
			
			System.out.println("Uploading the reel...");
			Thread.sleep(2000);
			
			System.out.println("Sharing the reel.");
			Thread.sleep(2000);
		}
		catch(InterruptedException  e) {
			e.printStackTrace();
		}
	}
}
