import java.util.Scanner;

public class O1523 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		if (0 > n || 100 < n || m < 0 || m > 3) {
			System.out.println("INPUT ERROR!");
			return;
		}

		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 2:
			for (int i = n; i >= 0; i--) {
				for (int j = i; j > 0 ; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 3:
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n -i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2*i + 1; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < n -i; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}	
		}
	}
}