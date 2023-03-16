
public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score = {98,85,77,89,100};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
	    float avg = sum / (float)score.length;
		System.out.println(avg);
 	}
}
