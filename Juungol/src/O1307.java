import java.util.Scanner;

public class O1307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char arr[][] = new char[num][num];
		char ch = 'A';
		
		for (int i = num-1; i >= 0; i--) {
			for (int j = num-1; j >= 0; j--) {
				arr[j][i] = ch;
				ch++;
				if(ch > 'Z') {
					ch = 'A';
				}
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
