import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial f=new Factorial();
		int res = f.fact(n);
		System.out.println(res);

	}

}
