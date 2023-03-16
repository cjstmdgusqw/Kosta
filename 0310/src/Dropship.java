public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("(" + x + "," + y + ")로 굴러서 이동");
	}
	
	void load() {
		System.out.println("짐은 싣다");
	}
	
	void unload() {
		System.out.println("짐은 내린다");
	}
}
