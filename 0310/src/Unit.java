public class Unit {
	int x, y;
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void stop() {
		System.out.println("(" + "," + y + "에 멈춤");
	}
}
