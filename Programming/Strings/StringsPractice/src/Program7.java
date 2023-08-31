import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to convert the case");
		String s=sc.nextLine();
		convertCase(s);
		

	}
	static void convertCase(String s) {
		for(int i=0;i<s.length();i++) {
			String f;
			if(Character.isLowerCase(s.charAt(i))) {
				f = s.toUpperCase();
			}
			else {
				f = s.toLowerCase();
			}
		}
		System.out.println(s);
		
	}
}
