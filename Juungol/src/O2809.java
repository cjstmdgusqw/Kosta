import java.util.Arrays;
import java.util.Scanner;

// 한 개의 정수를 입력받아 입력받은 정수의 약수를 모두 출력하는 프로그램을 작성하시오.
public class O2809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		int arr[] = new int[1000];
		double n2 = Math.sqrt(N);
		for (int i = 1; i <= (int) n2; i++) {
			if (N % i == 0) {
				if (i == (N / i)) {
					arr[cnt++] = i;
				} else {
					arr[cnt++] = i;
					arr[cnt] = (N / i);
					cnt++;
				}
			}
		}
		Arrays.sort(arr);
		for (int i : arr) {
			if (i == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
