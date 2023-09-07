import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to print the unicode value of every character");
		String s1=sc.nextLine();
		unicode(s1);
	}
	static void unicode(String s1) {
		for(int i=0;i<s1.length();i++) {
			int unicode = s1.charAt(i);
			System.out.print(unicode+" ");
		}
	}
}
