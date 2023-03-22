import java.util.Scanner;

public class O1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int num = 1;
		
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = num++;
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
