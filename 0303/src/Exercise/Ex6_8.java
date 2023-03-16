package Exercise;

public class Ex6_8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1); // 지역변수

	}

}

class PlayingCard {
	int kind;
	int num; // 인스턴스 변수
	
	static int width; 
	static int height; //클래스 변수
	PlayingCard(int k, int n) {
		kind = k; // 지역변수
		num = n; // 지역변수
	}
}
