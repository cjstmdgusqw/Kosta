public class Ex5_8_d {

	public static void main(String[] args) {
		int[] answer = {4,1,2,3,4,1,2,3,3,1};
		int[] correct = {4,2,1,3,2,1,2,4,3,1};
		
		int score = 0;
		for (int i = 0; i < correct.length; i++) {
			if(answer[i] == correct[i]) {
				score++;
			}
		}
		System.out.println("맞은 답 수 : " + score);
	}

}
