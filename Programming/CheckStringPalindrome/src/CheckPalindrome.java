
public class CheckPalindrome {
	public static boolean isPalinrome(String s) {
		char arr1[]=s.toCharArray();
		
		char arr2[] = new char[arr1.length];
		
		int j=arr1.length-1;
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[j];
			j--;
		}
		String rev = new String(arr2);
		if(s.equalsIgnoreCase(rev)) {
			return true;
		}
		else {
			return false;
		}
	}
}
