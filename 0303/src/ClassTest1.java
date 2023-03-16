class Person { // 데이터타입 정의하기
	int age;
	String name;
	
	Person() {
		
	}// 생성자 . 클래스명과 동일하게 생긴 메서드, 단 메서드 타입을 지정하지 않는다.
	
	public void info() {
		System.out.println("이름 : " + name +", 나이 : " + age);
	}
}

public class ClassTest1 {

	public static void main(String[] args) {
		
		Person p = new Person(); // 객체 , 인스턴스화한다고 생각해도 된다
		// new Person():객체, p:레퍼런스(객체의 주소를 담고있다. 그 주소를 통해 객체에 접근한다.)
		p.age = 20;
		p.name = "홍길동";
		
		p.info();
		
		Person p2 = p;
		p.age = 30;
		p.name = "승현";
		
		p2.info();
	}
}

//자바갯수당 하나가 생성되는게 아닌 class당 하나의 class파일이 생기는것

//속성은 변수로, 기능은 메서드로 정의한다. 항상가로가 들어간다(메서드)
//메서드 형태 --->  void Power() {Power=! power)
