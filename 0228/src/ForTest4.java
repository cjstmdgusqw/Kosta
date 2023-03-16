
public class ForTest4 {

	public static void main(String[] args) {
		int sum = 0, i;
		for (i = 1; ; i++) {
			sum += i;
			if(sum>= 100) {
				break;
			}
		}
		System.out.println(i);
	}
}
