import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String s = sc.nextLine();
		System.out.println("The String Before reversing is "+s);
		char arr1[]=s.toCharArray();
		
		char arr2[] = new char[arr1.length];
		
		int j=arr1.length-1;
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[j];
			j--;
		}
		s = new String(arr2);
		//s = arr2.toString();
		System.out.println("The STring after reversing is "+s);
	}

}
