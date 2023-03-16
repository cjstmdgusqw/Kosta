public class Exercise5__8 {

	public static void main(String[] args) {
		
		// counter[0] = 3; // 1의 갯수
		// counter[1] = 2; // 2의 갯수
		// counter[2] = 2; // 3의 갯수
		// counter[3] = 2; // 4의 갯수
//		
//		for (int i = 0; i < answer.length; i++) {
//			counter[answer[i] - 1]++;
//		}
//		for (int i = 0; i < counter.length; i++) {
//			System.out.println();
//		}
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			switch (answer[i]) {
			case 1:
				counter[0]+=1;break;
			case 2:
				counter[1]+=1;break;
			case 3:
				counter[2]+=1;break;
			default:
				counter[3]+=1;break;
			}
		}
		for (int i = 0; i < counter.length; i++) {
			int num = counter[i];
			System.out.print(num);
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
