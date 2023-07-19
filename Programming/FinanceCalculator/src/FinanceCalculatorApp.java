import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        double principle = sc.nextDouble();
	        double rate = sc.nextDouble();
	        double time = sc.nextDouble();
	        FinanceCalculator fc=new FinanceCalculator();
	        System.out.printf("%.2f",fc.calculateSimpleInterest(principle, rate, time));

	}

}
