import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings to concatenate of the values are equal");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("The concatenated String is "+(s1+s2));
		}
		else {
			System.out.println("The String values are not equal");
		}
	}

}
