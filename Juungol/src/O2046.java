import java.util.Scanner;

public class O2046 {

	public static void main(String[] args) {
		int cnt = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][n];

		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(cnt+" ");
				}
				cnt++;
				System.out.println();
			}break;
		case 2:	
			int cnt2 = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(i % 2 == 1) {
						cnt2--;
						arr[i][j] = cnt2;
					}else {
						arr[i][j] = cnt2;
						cnt2++;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			break;
		case 3:
			int cnt3 = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(i == 0) {
						arr[i][j] = cnt3++;
					}else {
						arr[i][j] = arr[0][j] * (i + 1);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		case 4 : 
			int k = 0;
			for (int i = 0; i < m; i++) {
				k = i;
				for (int j = 0; j < m; j++) {
					System.out.print(k);
					k += i;
				}
				System.out.println();
			}
		default:
			break;
		}
	}
}

