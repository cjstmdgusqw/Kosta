import java.util.ArrayList;

public class ArrayListTest4 {
	
	public static void printInfo(Person[] ad) {
		for (Person person : ad) {
			System.out.println(person.info());
		}
	}

	public static void main(String[] args) {
		ArrayList<Person> pers = new ArrayList<>();
		pers.add(new Person("홍길동", 20));
		pers.add(new Person("고길동", 25));
		
		Person[] narr = new Person[pers.size()];
		pers.toArray(narr);
		
		printInfo(narr);
	}

}
