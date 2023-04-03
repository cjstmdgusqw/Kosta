import java.util.Scanner;

public class O1719 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int center = n / 2;
		
		if(!(n <= 100) || n % 2 == 0 || n2 <1 || n2 > 4) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		switch (n2) {
		case 1:
			for (int i = 1; i <= center; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = center + 1; i <= n; i++) {
				for (int j = 1; j <= n + 1 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= center; i++) {
				for (int j = i; j < center + 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = center; i < n; i++) {
				for (int j = center; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j < n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = center; i >= 1; i--) {
				for (int j = 0; j < center - i; j++) {
					System.out.print(" ");
				}
				for (int j = 2 * i + 1; j >= 1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i <= center + 1; i++) {
				for (int j = 0; j < center + 1 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 4:
			for (int i = center + 1; i >= 1; i--) {
				for (int j = 0; j < center + 1 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i <= center; i++) {
				for (int j = 1; j <= center; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}break;
			
		}
	}
}