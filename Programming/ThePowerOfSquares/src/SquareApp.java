import java.util.Scanner;

public class SquareApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ThePowerOfSquares s = new ThePowerOfSquares();
		System.out.println(s.squareNumber(num));
	}

}
