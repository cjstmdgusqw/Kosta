class Data {
	int n;
}

public class ParamTest1 {
	
	public static void increment1 (int data) { // 기본형 : read only
		data++;
	}
	
	public static void increment2 (Data data) { // 참조형 매개변수 : read write
		data.n++;
	}
	public static void increment3(int[] narr) {
		for (int i = 0; i < narr.length; i++) {
			narr[i]++;
		}
	}
	public static void main(String[] args) {
		Data data = new Data();
		data.n = 10;
		
		increment1(data.n);
		System.out.println(data.n);
		
		increment2(data); // 주소자체를 넘김
		System.out.println(data.n);
		
		int[] arr = new int[] {1,2,3};
		increment3(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
