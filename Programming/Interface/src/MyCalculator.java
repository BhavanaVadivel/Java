import java.util.Scanner;

public class MyCalculator implements Calculator{
	Scanner sc = new Scanner(System.in);

	@Override
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
}
