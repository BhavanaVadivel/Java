import java.util.Scanner;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check palindrome");
		String s = sc.nextLine();
		boolean res = CheckPalindrome.isPalinrome(s); 
		if(res == true) {
			System.out.println("The given string "+s+" is a palindrome");
		}
		else {
			System.out.println("The given string "+s+" is not a palindrome");
		}
	}

}
