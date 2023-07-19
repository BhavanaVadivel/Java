import java.util.Scanner;
public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		MessageDecoder md = new MessageDecoder();
		System.out.println(md.decodeCharacter(ch));
	}

}
