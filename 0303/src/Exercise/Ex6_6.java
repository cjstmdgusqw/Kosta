package Exercise;

public class Ex6_6 {
	
	static double getDistance(int x, int y, int x1, int y1) {
		int length = (int)Math.pow((double)(x - x1), 2) + (int)Math.pow((double)(y - y1), 2);
		double Length = Math.sqrt((double)length);
		return Length;
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
