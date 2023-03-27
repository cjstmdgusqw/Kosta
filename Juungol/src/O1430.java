import java.util.Scanner;

public class O1430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr2[] = new int[10];
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = num1 * num2 * num3;
		String re = Integer.toString(result);
		for (int i = 0; i < re.length(); i++) {
			for (char j = '0'; j <= '9'; j++) {
				if(re.charAt(i) == j) {
					arr2[re.charAt(i) - 48]++;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
