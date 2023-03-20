public class Person implements Comparable<Person>{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	String info() {
		return name + ":" + age;
	}
	
	
	
	@Override
	public String toString() {
		return name + ": "+ age;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false) {
			return false;
		}
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int compareTo(Person o) {
		return age-(o.age);
	}
	
	// set의 특징이라는건강 
}