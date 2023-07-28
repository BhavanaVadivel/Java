import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers to find GCD ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		//GCD gcd=new GCD();
		System.out.println("The GCD of "+m+" and "+n+" is "+GCD.findTheGCD(m, n));
	}

}
