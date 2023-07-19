import java.util.Scanner;
public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        System.out.println(TimeConverter.convertToHours(minutes));
	}

}
