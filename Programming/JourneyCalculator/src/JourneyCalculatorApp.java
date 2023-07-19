import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     double s = sc.nextDouble();
	     double t = sc.nextDouble();
	     JourneyCalculator j = new JourneyCalculator();
         double res = j.calculate(s,t);
         System.out.printf("%.2f\n",res);
	}

}
