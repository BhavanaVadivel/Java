package collectionsSorting;

import java.util.*;

public class ComplexSortingDemo {
	public static void main(String[] args) {
		Student s1 = new Student(11,"Mick",98.5);
		Student s2 = new Student(33,"Chaya",90.6);
		Student s3 = new Student(22,"Ananya",75.5);
		
		/*String str = new String("Dummy String");
		System.out.println(str.toString());
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);*/
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("Before Sorting ");
		System.out.println(al);
		System.out.println();
		//SortStudentsById s = new SortStudentsById();
		//Collections.sort(al,new Comparator<Student>();//and the logic in sortSt..
		//Collections.sort(al);
		//Collections.sort(al,s);

		//Sorting based on Name
		Collections.sort(al,new Comparator<Student>(){
			public int compare(Student s1,Student s2) {
				if(s1.getId() > s2.getId()) {
					return 1;
				}
				else if(s1.getId() < s2.getId()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		System.out.println("After Sorting by ID ");
		System.out.println(al);
		System.out.println();

		//Sorting based on Name
		Collections.sort(al,new Comparator<Student>(){
			public int compare(Student s1,Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});

		System.out.println("After Sorting by Name ");
		System.out.println(al);
		System.out.println();
		//Sorting based on Percentage
		Collections.sort(al,new Comparator<Student>(){
			public int compare(Student s1,Student s2) {
				if(s1.getPercentage() > s2.getPercentage()) {
					return 1;
				}
				else if(s1.getPercentage() < s2.getPercentage()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		System.out.println("After Sorting by Percentage ");
		System.out.println(al);
;
	}
}
