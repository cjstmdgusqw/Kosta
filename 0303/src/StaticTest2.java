class TestClass {
	int iv;
	static int sv;
	
	void ifunc() {// 인스턴스 메서드
		iv = 10; // instance method 에서는 instance 변수 접근 가능
		sv = 50; // instance method에서는 static 변수 접근 가능
		sfunc(); // instance method에서는 static method호출 가능
	}
	static void sfunc() { // 같은 클래스래도 불가능함
		// iv = 20; //  static method에서는 instance 변수 접근 불가능
		// ifunc(); // static method에서는 instance method 호출 불가능
		sv = 200; // static method 에서는 static 변수 접근 가능
	}
}
public class StaticTest2 {

	public static void main(String[] args) {
		TestClass.sv = 100; // static 변수는 클래스 이름으로 접근
		TestClass.sfunc(); // static method는 클래스이름으로 접근
		
//		TestClass.iv = 200;
		TestClass t = new TestClass();
		t.iv = 20; // instance 변수는 객체 생성 후 레퍼런스를 통해 접근
		System.out.println(t.iv);
		//Testclass.ifunc();
		t.ifunc(); // instance method 는 객체 생성 후 레퍼런스를 통해 접근
	}

}
