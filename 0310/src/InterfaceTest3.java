interface IClick{
	void click();
}
class Button {
	IClick iclick;
	public void onClick() {
		System.out.println("버튼이 눌림");
		if(iclick != null) {
			iclick.click();
		}
	}
	public void addClickEventListner(IClick iclick) {
		this.iclick = iclick;
	}
}

//class LoginClick implements IClick{
//	public void click() {
//		System.out.println("로그인 처리");
//	}
//}

public class InterfaceTest3 {

	public static void main(String[] args) {
        Button loginBtn = new Button();
//        loginBtn.addClickEventListner(new LoginClick());
        loginBtn.addClickEventListner(new IClick(){ // 클래스 정의 (IClick 상속받아 추상메소드 오버라이딩), 생성, 매개변수로 넘김
        	public void click() {
        		System.out.println("로그인 처리");
        	}
        });
	}
}
