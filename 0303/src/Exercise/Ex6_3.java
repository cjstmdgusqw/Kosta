package Exercise;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal(){
		int total = kor + eng + math;
		return total;
	}
	float getAverage() {
		float avg = Math.round(((kor + eng + math) / 3f) *100) / 100f;
		return avg;
	}
//	
//	Student(String name, int ban, int no,int kor, int eng, int math){
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	String info() {
//		return name + ", " +ban + ", "  + no + ", " + kor + ", "  + eng + ", "  + math;
//	}
}

public class Ex6_3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
//		Student y  = new Student("홍길동",1,1,100,60,76);
//		System.out.println(y.info());

	}

}
