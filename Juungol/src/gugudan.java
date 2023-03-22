import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 2 < a < 9, 2 < b < 9
			if (((a < 2) || (a > 9)) || ((b < 2) || (b > 9))) {
				System.out.println("INPUT ERROR!");
			} else if (a > b) {
				for (int i = 1; i <= 9; i++) {
					for (int j = a; j >= b; j--) {
						System.out.printf("%d * %d = %2d   ", j, i, j * i);
					}
					System.out.println();
				}break;
			} else {
				for (int i = 1; i <= 9; i++) {
					for (int j = a; j <= b; j++) {
						System.out.printf("%d * %d = %2d   ", j, i, j * i);
					}
					System.out.println();
				}break;
			}
		}
	}
}