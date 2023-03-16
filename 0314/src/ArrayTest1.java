import java.util.ArrayList;

public class ArrayTest1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList(); // 배열의 길이를 조절가능
		Object obj1 = new Integer(10);
		
		Object obj2 = 20; // boxing // 기본 타입의 값을 포장개게로 만드는 과정을 박싱
		int n = (int)obj2; // unboxing // 포장객체에서 기본 타입의 값을 얻어내는 과정을 언박싱
		
		
//		Integer wi = new Integer(10);
//		int i = wi.intValue();
//		
//		double d = 3.14;
//		double wD = new Double(d);
//		
//		boolean b = true;
//		Boolean wB = new Boolean(b);
		
		//add
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		//get
		for (int j = 0; j < a1.size(); j++) {
			System.out.println(a1.get(j));
		}
		
		//향상된 for문
		for (Object object : a1) {
			System.out.println(object);
		}
	}

}
