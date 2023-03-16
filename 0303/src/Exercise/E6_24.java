package Exercise;

public class E6_24 {
	
	public static int abs(int a){
		int result = 0;
		result = Math.abs(a);
		return result;
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}

}
