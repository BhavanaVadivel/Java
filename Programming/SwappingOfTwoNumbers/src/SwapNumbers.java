import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for swapping");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swapping : "+a+" "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping : "+a+" "+b);
	}

}
