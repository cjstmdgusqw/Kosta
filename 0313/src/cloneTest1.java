
public class cloneTest1 {
	
	static void printArr(int[] arr) {
		for(int n : arr) {
			System.out.print(n + ",");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30};
		int[] cpy = arr.clone();
		printArr(arr);
		System.out.println();
		printArr(cpy);
		System.out.println();
		
		arr[0] = 100;
		printArr(arr);
		System.out.println();
		printArr(cpy);
	}

}
