import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int n = sc.nextInt();
		Reverse r = new Reverse();
		int res = r.findReverse(n);
		System.out.println("The reverse of the number is "+res);
		if(n==res) {
			System.out.println("The Entered number "+n+" is a palindrome ");
		}
		else {
			System.out.println("The Entered number "+n+" is not a palindrome ");
		}
	}
}
