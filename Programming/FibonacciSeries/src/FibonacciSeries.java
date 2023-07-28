import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find fibonacci Series");
		int n=sc.nextInt();
		findFibonacci(n);
	}
	public static void findFibonacci(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.println(fib1);
		}
		/*else if(n==2) {
			System.out.print(fib1+" "+fib2);
		}*/
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
				int next=fib1+fib2;
				System.out.print(next+" ");
				fib1 = fib2;
				fib2 = next;
			}
		}
	}
}
