import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		TemperatureConverter t=new TemperatureConverter();
        System.out.printf("%.2f",t.convertFahrenheitToCelsius(68.0));

	}

}
