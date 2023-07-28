import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find prime Numbers in a range untill where");
		int n = sc.nextInt();
		int count=0;
		for(int i=3;i<n;i++) {
			int res = primeNumbers(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}
		}
		System.out.println("The number of prime numbers present are "+count);
	}
	public static int primeNumbers(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
		 	}
}
