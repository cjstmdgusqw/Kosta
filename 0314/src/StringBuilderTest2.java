
public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("안녕하세요~~.");
		
		//charAt
		char ch = sb.charAt(4);
		System.out.println(ch);
		
		//delete
		sb.delete(5, 7);
		System.out.println(sb);
		
		//insert
		sb.insert(sb.length()-1, " 반갑습니다");
		System.out.println(sb);
		
		//replace
		sb.replace(0, 5, "Hello,");
		System.out.println(sb);
				
		//reverse
		sb.reverse();
		System.out.println(sb);
	}

}
