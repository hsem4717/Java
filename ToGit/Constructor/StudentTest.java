package Constructor;

public class StudentTest{
	public static void main(String[] args) {
		Student park = new Student(20221, "Park");
		Student kim = new Student(20222, "Kim");
		Student lee = new Student(20223, "Lee");
		System.out.println("Student 객채의 수: " + Student.count);
		
		
	}
	
}

class Student{
	static int count = 0;
	
	int id;
	String name;
	
	Student(int _id, String _name){
		Student.count++;
		id = _id;
		name = _name;
	}
}
