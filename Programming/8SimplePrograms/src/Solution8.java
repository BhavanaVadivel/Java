import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		oddAndFive(n);
		
		}
	public static void oddAndFive(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.println("The odd numbers divisible by 5 are "+i);
			}
		}
	}	

}
