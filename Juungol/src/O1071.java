import java.util.Scanner;

public class O1071 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int cnt2 = 0;
		int num = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		String[] str2 = str.split(" ");
		int num2 = Integer.parseInt(sc.nextLine());
		for (String S : str2) {
			if(Integer.parseInt(S) <= num2 && num2 % Integer.parseInt(S) == 0) {
				cnt+= Integer.parseInt(S);
			}
			
			if(Integer.parseInt(S) >= num2 && Integer.parseInt(S) % num2 == 0 ){
				cnt2 += Integer.parseInt(S);
			}
		}
		System.out.println(cnt);
		System.out.println(cnt2);
	}
}
