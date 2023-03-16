
public class ClassTest2 {

	public static void main(String[] args) {
		Person[] pers = new Person[3]; // 클래스의 배열은 클래스 객체가 아니다. 배열 객체이다. 따라서 각 배열요소에 객체를 생성해서 사용해야 한다.
		pers[0] = new Person(); // 배열자체가 클래스임.
		pers[0].age = 20;
		pers[0].name = "천승현";
		
		pers[1] = new Person();
		pers[1].age = 30;
		pers[1].name = "홍길동";
		
		pers[2] = new Person();
		pers[2].age = 40;
		pers[2].name = "누구냐넌";
		
		for (int i = 0; i < pers.length; i++) {
			pers[i].info();
		}
	}
}
