
public class TestMain01 {

	public static void main(String[] args) {
		int[][] array = { 
				{ 12, 41, 36, 56, 21 }, 
				{ 82, 10, 12, 61, 45 }, 
				{ 14, 16, 18, 78, 65 },
				{ 45, 26, 72, 23, 34 }, 
				};
		
		int result = 0;
		int C =  ((array.length) * (array[0].length));
		float avg = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				result += array[i][j];
			}
		}avg = result / (float)C;
		System.out.println(result);
		System.out.println(avg);
	}

}
