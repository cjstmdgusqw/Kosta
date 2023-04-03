import java.util.Scanner;

public class O1329 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int center = cnt / 2;
		
		if(cnt < 0 || cnt > 100 || cnt % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		
		for (int i = 0; i <= center; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = center; i > 0; i--) {
			for (int j = 0; j < i-1 ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}