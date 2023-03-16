public class WhileTest4 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) {
			sum += i;
			if(sum > 100) {
				break;
			}
			i++;
	    }
		System.out.println("합 : " + sum + " i : " + i);	
    }
}