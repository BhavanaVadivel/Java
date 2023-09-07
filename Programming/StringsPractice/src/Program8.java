import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		countString(str);
	}
	static void countString(String str) {
		char arr[]=str.toCharArray();
		int count=1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=' ') {
			
			for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]==arr[j]){
						arr[j]=' ';
						count++;
					}
			}
			}
			if(arr[i]!=' ')
				System.out.println(arr[i]+" -> "+count);//String.valueOf(arr[i])
		}
	}
}
