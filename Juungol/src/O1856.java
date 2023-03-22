import java.util.Scanner;

public class O1856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		int num = 1;
		
	
		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = num++;
				}
			}else if(i % 2 == 1){
				for (int j = m-1; j >=0 ; j--) {
					arr[i][j] = num++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
