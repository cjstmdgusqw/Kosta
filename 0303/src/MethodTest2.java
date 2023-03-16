//class MyMath{
//	long add(long a, long b) {
//		long result = a + b;
//		return result;
//	}
//}

public class MethodTest2 {
	static long add(long a, long b) {
		long result = a + b;
		a = 100;
		b = 200;
		return (int) result;
	}

	public static void main(String[] args) { // 반드시 객체를 생성하고 넣어야한다. new를 쓰는이유는 
		int a = 10, b = 20;
		long sum = add(10,20); // 변수는 차례대로 함수그자리로 return값이 나오는것
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
	}
}
