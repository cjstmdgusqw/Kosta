class Calculator {
	int x, y;
	
	int add(){
	    return x + y;	
	}
	int sub() {
		return x - y;
	}
	int mul() {
		return x * y;
	}
	static int add(int x, int y) {
		return x+y;
	}
	static int sub(int x, int y) {
		return x-y;
	}
	static int mul(int x, int y) {
		return x*y;
	}
}
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.x = 10;
		calc.y = 20;
		
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		
		System.out.println(Calculator.add(20, 10));
		System.out.println(Calculator.mul(20, 10));
		System.out.println(Calculator.sub(20, 10));
	}
//생성자란 인스턴스개 생성될때마다 호출되는 인스턴스초기화메서드라고한다
}

//메서드 오버로딩
