
public class StudentApp {

	public static void main(String[] args) {
		Student s= new Student();
		s.setId(101);
		s.setName("Bhavana");
		s.setMarks(100);
		s.setGender("Female");
		System.out.println("Roll number "+s.getId()+" Student "+s.getName()+" Scored "+s.getMarks()+" Marks who is a "+s.getGender());
	}

}
