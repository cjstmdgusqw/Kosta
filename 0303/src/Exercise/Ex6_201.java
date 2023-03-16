package Exercise;

public class Ex6_201 {
	
	public static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random()*arr.length);
			int num2 = (int)(Math.random()*arr.length);
		}
		return arr;
	}

	public static void main(String[] args) {
	    int[] original = {1,2,3,4,5,6,7,8,9};
	    
//	    System.out.println(java.util.Arrays.toString(original));
	    int[] result = shuffle(original);
	    System.out.println(java.util.Arrays.toString(result));
	}
}



