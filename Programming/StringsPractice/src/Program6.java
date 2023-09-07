import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to convert to Uppercase");
		String s=sc.nextLine();
		String res = printUpperCase(s);
		System.out.println(res);
	}
	static String printUpperCase(String s) {
		s=s.toUpperCase();
		return s;
	}

}
