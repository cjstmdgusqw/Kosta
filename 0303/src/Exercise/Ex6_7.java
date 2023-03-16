package Exercise;

class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Double getDistance(int x1, int y1){
		int length = (int)Math.pow((double)(x - x1), 2) + (int)Math.pow((double)(y - y1), 2);
		double Length = Math.sqrt((double)length);
		return Length;
	}
}
public class Ex6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		 // p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2)); 

	}

}
