import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number greater than 100");
		int n = sc.nextInt();
		if(n>100) {
			divisibleByFive(n);
		}
	}
	public static void divisibleByFive(int n) {
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println("The numbers divisible by 5 are "+i);
			}
		}
	}
}
