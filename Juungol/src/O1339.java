import java.util.Scanner;

public class O1339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if ((num % 2 == 0) || (num <= 1) || (num >= 100)) {
			System.out.println("INPUT ERROR");
			return;
		}
		char ch = 'A';
		char[][] arr = new char[num][num];
		for (int i = (num / 2); i >= 0; i--) {
			for (int j = i; i + j <= num - 1; j++) {
				arr[j][i] = ch;
				if (ch == 'Z') {
					ch = 'A';
				} else {
					ch++;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (arr[i][j] == '\0') {
					arr[i][j] = ' ';
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
