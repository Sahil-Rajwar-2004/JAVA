public class StudentInfo{
	public static void main(String[] args){
		Student sahil = new Student();
		sahil.id = 37;
		sahil.name = "Sahil Rajwar";
		sahil.marks = 71f;

		System.out.println(sahil.id);
		System.out.println(sahil.name);
		System.out.println(sahil.marks);
	}
}

class Student{
	int id;
	String name;
	float marks;
}
