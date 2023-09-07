import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		GCD g=new GCD();
		int res = g.gcd(m,n);
		System.out.println(res);

	}

}
