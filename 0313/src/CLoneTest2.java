class Person implements Cloneable{ // 자바에서 제공하는 패키지
	int age;
	String name;
	Person(){}
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	Person(Person p){
		this.age = p.age;
		this.name = p.name;
	}
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return age == p.age && name.equals(p.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}	
}
public class CLoneTest2 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = p1;
		Person p3 = new Person(p1);
		Person p4 = (Person)p1.clone();
		
		p1.age = 30;
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}

// public 
// protected??
