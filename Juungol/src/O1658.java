import java.util.Scanner;

public class O1658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int SH = 1;
		int CH = 0;
		int cnt = (N > M)? N : M;
		for (int i = 1; i <= cnt; i++) {
			if(N % i == 0 && M % i == 0) {
				SH = i;
			}
		}
		System.out.println(SH);
		CH = (N / SH) * (M / SH) * SH;
		System.out.println(CH);
	}

}
