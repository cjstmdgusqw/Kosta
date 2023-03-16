class MyClass {
	int in; //객체 생성시, 즉 new MyClass() 할때마다 생성된다.
	static int sn; //static(class)변수
	//객체를 공유하기위해서 사용하는 변수는 static
	String lastname = "이";
}

public class StaticTest {

	public static void main(String[] args) {
		MyClass.sn = 100;
		
		MyClass mc1 = new MyClass(); // 메모리생성됨
		mc1.in = 10;
		mc1.sn= 200;
		System.out.println(mc1.in);

		MyClass mc2 = new MyClass();
		System.out.println(mc2.in);
		System.out.println(mc2.sn);
		
		MyClass lee1 = new MyClass();
		System.out.println(lee1.lastname);
		
	}

}
