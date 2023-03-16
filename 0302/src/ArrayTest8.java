
public class ArrayTest8 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		
		arr1[0] = 100; //값을 넣은게 아닌 arr의 주소를 참조하는것
		
		int[] arr2 = arr1;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		
		
	}

}
