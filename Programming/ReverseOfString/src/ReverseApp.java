import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str = sc.nextLine();
		Reverse r = new Reverse();
		String res = r.reverseString(str);
		System.out.println("The reversed String is "+res);
	}

}
