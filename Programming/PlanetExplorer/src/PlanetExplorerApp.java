import java.util.Scanner;
public class PlanetExplorerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        PlanetExplorer pe=new PlanetExplorer();
        System.out.printf("%.2f",pe.calculateSurfaceArea(radius));
	}

}
