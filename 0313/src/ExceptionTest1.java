public class ExceptionTest1 {

	public static void main(String[] args) {
		String str = null; // 객체가 생성되지않음
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("널 예외");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}

