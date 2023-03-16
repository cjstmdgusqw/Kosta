
public class MethodTest1 {
	public static void func1() {
		int n = 10;
		System.out.println(n);
		func2();
		System.out.println("func1종료");
	}
	
	public static void func2() {
		int n = 20;
		System.out.println(n);
		System.out.println("func2종료");
	}

	public static void main(String[] args) {
		int n = 30;
		System.out.println(n);
		func1();
		System.out.println("main 종료");
	}
}
