import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number greater than 100");
		int n = sc.nextInt();
		if(n>100) {
			divisibleByThreeAndFive(n);
		}
	}
	public static void divisibleByThreeAndFive(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("The numbers divisible by 3 and comes in the table 5 are "+i);
			}
		}
}

}
