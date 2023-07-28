import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find armstrong number or not");
		int n = sc.nextInt();
		ArmstrongNumber an = new ArmstrongNumber();
		int res = an.findArmstrong(n);
		if(res==n) {
			System.out.println("The entered number "+n+" is an armstrong Number");
		}
		else {
			System.out.println("The entered number "+n+" is not an armstrong Number");
		}
	}

}
