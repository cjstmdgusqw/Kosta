import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

// 한 개의 정수를 입력받아 입력받은 정수의 약수를 모두 출력하는 프로그램을 작성하시오.
public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				if(N % i ==0) {
					System.out.print(i+" ");
				}
			}
			
			 	
		}
}
