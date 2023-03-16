
public class ExceptionTest2 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30,40};
		int[] arr2 = new int[] {2,0,6};
		
//		try {
//			for (int i = 0; i < arr1.length; i++) {
//				System.out.println(arr1[i] / arr2[i]);
//			}
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		int tot = 0;
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			try {
				tot += arr1[i] / arr2[i];
				cnt++;
			} catch (ArithmeticException e) {
				tot += 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				cnt--;
				System.out.println(e.getMessage());
			}
		}
		System.out.println(tot/cnt);
		System.out.println("종료");
	}

}
