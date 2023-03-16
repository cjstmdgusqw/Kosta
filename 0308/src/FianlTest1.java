class Test{
	final int NUM;
	Test(int n){ // instance fianl 변순느 생성자에서 초기화해야한다. 명시적 초기화도 가능하지만 그럴 경우 모두 객체들이 같은 상수값을 사용해여만 하는 한다.
		NUM = n;
	}
	
//	void setNUM(int num) { // final 변수는 변경이 불가능하기 때문에 set함수도 사용하지 않는다
//		NUM = num;
//	}
}
final class Text2{}
//class Test3 extends Test2 {} // fianl class 상속 불가

class Test4{
	final void method() {}
}

class Test5 extends Test4{
	// void method() {} // final method override
}

public class FianlTest1 {

	public static void main(String[] args) {
		final int n;
		n = 10;
		// n = 20; // 초기화는 한번ㅁ나. 이후는 변경으로 간주되어 불가
		//n = 20; 변경불가이다
		
	}

}
