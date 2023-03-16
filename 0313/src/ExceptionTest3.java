
public class ExceptionTest3 {

	static void method1() throws Exception{ // 강제로 예외처리건을 생성해서 던질때 이렇게 사용한다.
		String str = null;
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("1차 예외 처리");
			throw new Exception("2차 예외");
		}
		System.out.println(str.toString());
	}
	public static void main(String[] args){
		try {
			method1();
		}catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		System.out.println("종료");
	}

}
