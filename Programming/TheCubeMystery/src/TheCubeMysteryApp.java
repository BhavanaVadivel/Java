import java.util.Scanner;
public class TheCubeMysteryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        TheCubeMystery c = new TheCubeMystery();
        System.out.println(c.cubeNumber(num));

	}

}
