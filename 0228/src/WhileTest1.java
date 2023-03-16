
public class WhileTest1 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		while(i <= 10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		int tot = 0;
		i = 1;
		while(i <= 100) {
			if(i % 5 == 0) {
				tot += i;
			}
			i++;
		}
		System.out.println(tot);
	}
}
