import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings to check their length is equal or not");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()==s2.length()) {
			System.out.println("Both strings are of same length");
		}
		else {
			System.out.println("Both strings are of different length");
		}
	}
	
}
