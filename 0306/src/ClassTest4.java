class Triangle{
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	Triangle(){}
	Triangle(int num1, int num2, int num3, int num4, int num5, int num6){
		p1.x = num1;
		p1.y = num2;
		p2.x = num3;
		p2.y = num4;
		p3.x = num5;
		p3.y = num6;
	}
	String info() {
		return "[삼각형:점1 = "+p1 +", 점2 - (" + p2.x +"," + p2.y + "), 점3 - (" + p3.x + "," + p3.y +")";
	}
}
public class ClassTest4 {

	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = "CatCat";
		String s4 = "Cat"+"Cat";
		String s44 = "Cat" + new String("Cat");
		String s45 = new String("CatCat");
		String s5 = "CatCat";
		
		System.out.println(s1==s2); // t
		System.out.println(s3==s5); // t
		System.out.println(s3==s4); // t
		System.out.println(s3==s44); // f
		System.out.println(s3==s45); // f
		
		String st1 = new String("Cat");
		String st2 = new String("Cat");
		
		System.out.println(st1==st2);
		
	    Triangle t1 = new Triangle(10,10,20,20,30,30); // p1 : (10,10) p2 (20,20) p3 (30,30)
	    System.out.println(t1.info());
	} 

}
