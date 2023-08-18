
public class Reverse {
	String reverseString(String str) {
		char ch;
		String rev = " ";
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch+rev;
		}
		return rev;
	}
}
