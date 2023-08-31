import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to count the uppercase and lowercase letters");
		String s=sc.nextLine();
		countCase(s);
	}
	static void countCase(String s) {
		int upperCount=0;
		int lowerCount=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				lowerCount++;
			}
			else {
				upperCount++;
			}
		}
		System.out.println("Lower case count is "+lowerCount);
		System.out.println("Upper case count is "+upperCount);
	}
}
