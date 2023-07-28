import java.util.Scanner;

public class VendingMachine {
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
			System.out.println("Coco Cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Miranda");
			break;
		case "P04":
			System.out.println("Slice");
			break;
		default:
			System.out.println("No stock");
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Code");
		String productCode = sc.next();
		getProduct(productCode);
	}

}
