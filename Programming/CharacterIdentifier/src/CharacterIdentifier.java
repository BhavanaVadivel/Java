import java.util.Scanner;

public class CharacterIdentifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
	}


public static void identifyCharacter(char ch) {
	if(Character.isDigit(ch)) {
		System.out.println("Entered Character "+ch+" Is a Digit");
	}
	else if(!Character.isLetter(ch)) {
		System.out.println("Entered Character "+ch+" Is a Special Character");
	}
	else {
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch)) {
				System.out.println("Entered Character "+ch+" Is a Lowercase vowel");
			}
			else {
				System.out.println("Entered Character "+ch+" Is a UpperCase Vowel");
			}
			break;
		default:
			if(Character.isLowerCase(ch)) {
				System.out.println("Entered Character "+ch+" Is a Lowercase Consonent");
			}
			else {
				System.out.println("Entered Character "+ch+" Is a UpperCase Consonent");
			}
		}
	}
}
}