import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String[] args) {
		int res1 = subtractNumbers(20,5);
		int res2 = subtractNumbers(4,5);
		double res3 = subtractNumbers(22,7);
		int res4 = subtractNumbers(10,3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.printf("%.2f\n",res3);
		System.out.println(res4);
	}
		public static int subtractNumbers(int a,int b) {
			return a-b;
		}
		public static int multiplyNumbers(int a,int b) {
			return a*b;
		}
		public static double divideNumbers(int a,int b) {
			return a/b;
		}
		public static int findRemainder(int a,int b) {
			return a%b;
		}
	
}
