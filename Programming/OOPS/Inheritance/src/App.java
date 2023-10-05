
public class App {

	public static void main(String[] args) {
		TeacherRobo tr=new TeacherRobo();
		DriverRobo dr=new DriverRobo();
		ChefRobo cr=new ChefRobo();
		
		tr.name="Chitti";
		tr.type="Humanoid";
		tr.talk();
		tr.walk();
		tr.charge();
		tr.teach();
		System.out.println("==============================================");
		dr.name="Amy";
		dr.type="Humanfenoid";
		dr.talk();
		dr.walk();
		dr.charge();
		dr.driving();
		System.out.println("==============================================");
		cr.name="will";
		cr.type="Androbranoid";
		cr.talk();
		cr.walk();
		cr.charge();
		cr.charge();
		System.out.println("==============================================");
	}

}
