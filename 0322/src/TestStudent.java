import java.util.ArrayList;
import java.util.List;

class Human{
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	Human(){}
	Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " 나이 : " + age +  " 키 : " + height + " 몸무게 : " + weight;
	}
}
class Student extends Human{
	String number;
	String major;
	Student(){}
	
	Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + " 번호 : " + number + " 과목 : " + major;
	}
}
public class TestStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 20, 177, 74, "201301", "체육"));
		list.add(new Student("이순신", 44, 178, 77, "201302", "체육"));
		list.add(new Student("유관순", 18, 155, 45, "201302", "컴퓨터"));
		
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
