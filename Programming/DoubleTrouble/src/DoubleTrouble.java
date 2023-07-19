import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(doubleTheNumber(n));
	}
	public static int doubleTheNumber(int n) {
		return n*2;
	}
}
