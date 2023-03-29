import java.util.Scanner;

public class O1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt() ,cnt = 0;
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				cnt++;
			}
		}
		int arr[] = new int[cnt], cnt2 = 0;
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				arr[cnt2] = i; cnt2++;
			}
		}
		
		if(K < arr.length) {
			System.out.println(arr[K-1]);
		}else {
			System.out.println(0);
		}
	}

}
