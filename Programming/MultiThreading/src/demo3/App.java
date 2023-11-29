package demo3;

public class App {

	public static void main(String[] args) {
		
		
	for(int i=1;i<=10;i++) {
		System.out.println("==>main()");
	}
		PrintNum t = new PrintNum();
		t.start();
		PrintChar d = new PrintChar();
		d.start();
	}

}
