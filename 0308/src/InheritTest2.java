class Base{
	int bnum;
	int gnum;
	int anum;
	
	Base(){
		System.out.println("Base ()");
	} // 그러므로 반드시 생성을 해줘야만한다.
	Base(int num){
		bnum = num;
		System.out.println("Base(int num)");
	}
	Base(int num, int num2){
		gnum = num;
		anum = num2;
		System.out.println("허러럴");	
	}
	void method1() {
		System.out.println("method1");
	}
}
class Derived extends Base{ // 아무것도 없는상태라면 기본적으로 생성자가 생성이 되어있는상태로 취급을 한다
	int dnum;
	// 1. 자식 클래스가 생성자를 만들지 않으면 자식의 기본생성자가 자동 생성되고 부모의 기본생성자를 호출한다.
	Derived() {
		System.out.println("Derived ()");
	}
	Derived(int num){
		dnum = num;
		System.out.println("Derived(int num)");
	}
	Derived(int bnum, int dnum){
	//	this.bnum = bnum; // 부모의 기본생성자
		super(bnum);
		this.dnum = dnum;// 부모의 생성자를 통해 부모 변수 초기화
		System.out.println("Derived(int bnum, int dnum)");
	}
	void method1(int n) {
		super.method1();
		System.out.println("derived method1");
	}
	void method1() { // overriding : ㅂ모의 메소드와 함수명과 파라미터가 같은 메서드 ---> 자식은 부모것을 무시한다
		System.out.println("derived method1");
	}
	void method2() {
		System.out.println("method2");
	}
}
public class InheritTest2 {

	public static void main(String[] args) {
//		Derived c1 = new Derived();
//		Derived c2 = new Derived(100);
		Derived c3 = new Derived(100, 200);
//		c3.method1();
//		c3.method2();

	}

}
