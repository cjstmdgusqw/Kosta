import java.util.Scanner;

public class O1707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int nump = num * 2 - 1;
		int arr[][] = new int[num][num];
		
		int cnt = 1;
		
		
		int T0 = 0;
		int num0 = num-1;
		
		int T1 = 1;
		int num1 = num - 1;
		
		int T2 = num - 1;
		int num2 = 0;
		
		int T3 = 0;
		int num3 = num - 2;
		
		
		
		
		for (int O = 0; O < nump; O++) {
			int numl = O % 4;
			switch (numl) {
			case 0: 
				for (int i = T0; i <= T0; i++) {
					for (int j = T0; j <= num0; j++) {
//						System.out.println(i);
//						System.out.println(j);
						arr[i][j] = cnt;
						cnt++;
					}
				}
				T0++;
				num0--;
				break;
			case 1: 
				for (int i = T1; i <= num1; i++) {
					for (int j = num1; j <= num1; j++) {
//						System.out.println(i);
//						System.out.println(j);
						arr[i][j] = cnt;
						cnt++;
					}
				}
				T1++;
				num1--;
				break;
			case 2:
				for (int i = T2; i <= T2; i++) {
					for (int j = T2-1; j >= num2; j--) {
//						System.out.println(i);
//						System.out.println(j);
						arr[i][j] = cnt;
						cnt++;
					}
				}
				T2--;
				num2++;
				break;
			case 3: 
				for (int i = num3; i > T3; i--) {
					for (int j = T3; j <= T3; j++) {
//						System.out.println(i);
//						System.out.println(j);
						arr[i][j] = cnt;
						cnt++;
					}
				}
				num3--;
				T3++;
				break;
				

			default:
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

	}

}
