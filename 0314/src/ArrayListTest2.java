import java.util.ArrayList;

class Person{
	int age;
	String name;
	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	String info() {
		return name + ", " + age;
	}

}

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<>();
		alist.add(new Person("홍길동", 24));
		alist.add(new Person("안길동", 34));
		alist.add(new Person("고길동", 44));
		
		for (Person person : alist) {
			System.out.println(person.info());
		}
		
		String[] arr = new String[10];
		arr[0] = "orange";
		arr[1] = "banana";
		
		for (String string : arr) {
			System.out.println(string);
		}

	}

}
