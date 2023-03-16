
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] narr1 = new int[5];
//		int [] narr1;
//		narr1 = new int[5];
		narr1[0] = 10;
		narr1[1] = 20;
		narr1[2] = 30;
		narr1[3] = 40;
		narr1[4] = 50;
		
		int[] narr2 = new int[] {10, 20, 30, 40, 50}; // 배열을 생성과 동시에 초기화 할 시에는 배열의 갯수를 생략해야한다.
//		int[] narr2;
//		narr2 = new int[] {10,20,30,40,50};
		int[] narr3 = {10,20,30,40,50}; //배열의 생성과 초기화를 동시에 할 때문 new int[] 생략 가능하다.
		
//		int[] narr3;
//		narr3 = {10,20,30,40,50}; // new int[]생략 안됨.
		
		int sum = 0;
		for (int i = 0; i <narr3.length; i++) {
			sum += narr3[i];
		}
		System.out.println(sum);
		
		int n, m;
		n = 10; // n이라는 변수에 10을 담는다
		m = n; // n에 있는 값을 읽어 m변수에 복사한다.
		System.out.println(n);
		
		int f = 100;
		float celcius = (float)(5/9) + (f-32);
		System.out.println("Fahrenheit:"+f);
		System.out.println("Celcius:"+celcius);
	}

}
