import java.util.Scanner;

public class O1341 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		while (true) {
			if (((n < 2) || (n > 9)) || ((m < 2) || (m > 9))) {
				System.out.println("INPUT ERROR!");
			}
			if (n > m) {
				for (int i = n; i >= m; i--) {
					for (int j = 1; j < 10; j++) {
						if ((j != 1) && (j % 3 == 1)) {
							System.out.println();
						}
						System.out.printf("%d * %d = %2d   ", i, j, i * j);
					}
					System.out.println();
					System.out.println();
				}break;
			} else {
				for (int i = n; i <= m; i++) {
					for (int j = 1; j < 10; j++) {
						if ((j != 1) && (j % 3 == 1)) {
							System.out.println();
						}
						System.out.printf("%d * %d = %2d   ", i, j, i * j);
					}
					System.out.println();
					System.out.println();
				}break;
			}
		}
	}
}
