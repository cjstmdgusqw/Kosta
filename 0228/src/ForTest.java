public class ForTest {

	public static void main(String[] args) {
		int eventot  = 0;
		
		for (int i = 0; i <= 100 ; i++) {
			if(i%2 == 0) {
				eventot += i;
			}
		}
		System.out.println(eventot);
		
		int ex3dtot = 0;
//		for (int i = 0; i <= 100; i++) {
//			if(i%3 != 0) {
//				ex3dtot += i;
//			}
//		}
		for (int i = 0; i <= 100; i++) {
			if(i%3 == 0) {
				continue;
			}
			ex3dtot += i;
		}
		System.out.println(ex3dtot);
		
		

	}

}
