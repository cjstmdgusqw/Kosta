class Student {
	int grade;
	int id;
	String name;
	
	Student() {
		System.out.println("Student");
	}
	
	Student(int id, int grade, String name){
		this.id = id;
		this.grade = grade;
		this.name = name;
	}
	
	Student(int id){
		this(id, 1, "none");
//		this.id = id;
	}
	
	Student(int id, String name){
//		this.id = id;
//		this.name = name;
		this(id, 1, name);
	}
	
	void info() {
		System.out.printf("학번 : %d, 이름 : %s, 학년:%d\n", id, name, grade);
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.info();
		
//		Student s2 = new Student(101, 3, "dkdkd");
//		s2.info();
		
		Student s3 = new Student(102);
		s3.info();
		// 학번 : 102 이름 null, 학번 ㅣ 0
		
		Student s4 = new Student(103, "Park");
		s4.info();
	}
}
