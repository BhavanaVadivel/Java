import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number greater than 100");
			int n = sc.nextInt();
			if(n>100) {
				divisibleByTwoAndFive(n);
			}
		}
		public static void divisibleByTwoAndFive(int n) {
			for(int i=1;i<=n;i++) {
				if(i%2==0 && i%5==0) {
					System.out.println("The numbers divisible by 2 and 5 are "+i);
				}
			}
	}

}
