import java.util.Scanner;
public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			long a = scan.nextLong();
			long b = scan.nextLong();
			long result = galacticArithmetic(a,b);
			System.out.println(result);
		

	}
	public static long galacticArithmetic(long a,long b) {
		return a+b;
	}

}
