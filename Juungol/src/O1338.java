import java.util.Scanner;

public class O1338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char arr[][] = new char[num][num];
		char c = 'A';
		
		int cq = 0;
		
		for (int i = 0; i <= num-1; i++) {
			int d = i;
			for (int j = num-1; j >= cq; j--) {
				if(c > 'Z') c = 'A';
				arr[d][j] = c;
				c++;
				d++;
			
			}
			cq++;
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr.length; j2++) {
				if(arr[j][j2] == '\0') {
					arr[j][j2] = ' ';
				}
				System.out.print(arr[j][j2] + " ");
			}
			System.out.println();
		}
	}
}
