
public class Dog {
	private String name;
	private String color;
	private int age;
	private String breed;
	
	public Dog(String name,String color, int age,String breed) {
		this.name=name;
		this.color=color;
		this.age=age;
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
}
