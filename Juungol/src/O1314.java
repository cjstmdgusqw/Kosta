import java.util.Scanner;

public class O1314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char ch = 'A';
		char[][] arr = new char[num][num];
		for (int i = 0; i < num; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					if(ch >='Z') {
						arr[j][i] = ch;
						ch = 'A';
					}else {
						arr[j][i] = ch;
						ch++;
					}
						
				}	
			}else {
				for (int j = num-1; j >= 0; j--) {
					if(ch >= 'Z') {
						arr[j][i] = ch;
						ch = 'A';
					}else {
						arr[j][i] = ch;
						ch++;
					}
				}
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}
}