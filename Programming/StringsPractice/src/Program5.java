import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to convert to lowercase");
		String s=sc.nextLine();
		String res = printLowerCase(s);
		System.out.println(res);
	}
	static String printLowerCase(String s) {
		s=s.toLowerCase();
		return s;
	}
}
