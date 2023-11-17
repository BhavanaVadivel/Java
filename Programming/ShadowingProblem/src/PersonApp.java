import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the id");
		        int id = sc.nextInt();
		        System.out.println("Enter the name");
		        sc.nextLine();
		        String name = sc.nextLine();
		        System.out.println("Enter the email id");
		        String email = sc.next();
		        System.out.println("Enter the gender");
		        String gender = sc.next();
		        System.out.println("Enter the phone number");
		        long phone = sc.nextLong();
		        Main p1= new Main(id, name, gender, email, phone);
		        System.out.println(p1.id+" "+p1.name+" "+p1.gender+" "+p1.email+" "+p1.phone);
		        p1.eat();
		        p1.sleep();
		    }
		
	}


