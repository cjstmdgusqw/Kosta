import java.util.Scanner;

public class StringBuilderTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//capcity
		System.out.println(sb.capacity());
		
		//append
		sb.append("이름:");
		sb.append(sc.nextLine());
		sb.append(",나이:");
		sb.append(sc.nextLine());
		System.out.println(sb);
		
		//setCharAt
		sb.setCharAt(3, '김');
		System.out.println(sb);
	}

}
