// 같은 package에 있는 클래스 생성 및 접근
public class AccessTest2 {

	public static void main(String[] args) {
		DTest dt1 = new DTest(); // 같은 package 내에 default 클래스 생성 가능.
		dt1.m = 10;
		// dt1.n = 20; // private 변수는 다른 클래스에서 접근 불가
		dt1.method();
		
		CTest ct1 = new CTest();
		// CTest ct2 = new CTest(10); // 같은 생성자래도 private 생성자로 객체 생성 불가.
	}

}
