//class Point() {
//	
//} // 같은 패키지라서 오류가 난다
class Rectangle{
	Point startPos;
	int width;
	int height;

	Rectangle(int x, int y, int k, int l) {
		startPos = new Point(x,y);
		width = k;
		height = l;
	}
	Rectangle(Point startPos, int width, int height){
		this.startPos = startPos;
		this.height = height;
		this.width = width;
	}
	
	Rectangle(){
		startPos = new Point();
	}
	
	Rectangle(int n, int m){
		startPos = new Point();
		width = n;
		height = m;
	}
	
	String info() {
		return "시작점 : " + startPos.toString()+ ", 가로(width) : " + width + ", 세로(height) : " + height; 
	}
	
}

public class ClassTest3 {

	public static void main(String[] args) {
        Rectangle rec1 = new Rectangle (10,10,20,5); // 시작점 : 10, 10, 가로(width) : 20, 세로(height) : 5
        Rectangle rec2 = new Rectangle(new Point(5,5), 30 ,10);
        Rectangle rec3 = new Rectangle();
        Rectangle rec4 = new Rectangle(30, 10);
	    System.out.println(rec1.info());
	    System.out.println(rec2.info());
	    System.out.println(rec3.info());
	    System.out.println(rec4.info());
	}
}
