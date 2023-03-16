class DTest {
	private int n; // 외부에 접근 불가능
	int m;
	
	void method() {
		n = 10;
		
	}
	
}
public class CTest {
	CTest() {}
	private CTest(int n) {}

}
