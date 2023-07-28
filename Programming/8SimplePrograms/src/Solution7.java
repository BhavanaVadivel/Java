import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		twoAndFive(n);
		}
	public static void twoAndFive(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println("The even numbers divisible by 3 are "+i);
			}
		}
}


	}


