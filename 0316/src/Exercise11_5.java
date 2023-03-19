//import java.util.*;
//
//class Student implements Comparable<Student>{
//	String name;
//	int ban;
//	int no;
//	int kor, eng, math;
//
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//
//	int getTotal() {
//		return kor + eng + math;
//	}
//
//	float getAverage() {
//		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
//	}
//
//	public String toString() {
//		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		return name.compareTo(o.name);
//	}
//}
//
//class Exercise11_5 {
//	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<>();
//		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
//		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
//		list.add(new Student("김자바", 1, 3, 80, 80, 90));
//		list.add(new Student("이자바", 1, 4, 70, 90, 70));
//		list.add(new Student("안자바", 1, 5, 60, 100, 80));
//		
//		Collections.sort(list);
//		Iterator it = list.iterator();
//		while (it.hasNext())
//			System.out.println(it.next());
//	}
//}

//6번 

import java.util.*;

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
} // class Student

//class StudentCompare implements Comparator<Student> { // 이름이 없는 클래스 클래스안에 클래스
//
////	@Override
////	public int compare(Student o1, Student o2) {
////		if(o1.getAverage() > o2.getAverage()) return 1;
////		else if(o1.getAverage() < o2.getAverage()) return 0;
////		else return -1;
////	}
//
//}

class Exercise11_5 {
	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
		SortedSet<Student> sset = tset.subSet(new Student(null, 0,0,from,from,from), new Student(null,0,0,to + 1, to + 1, to + 1));
		return sset.size();
	}

	public static void main(String[] args) {
		// TreeSet의 파라미터 타입은 comparator타입이다.

		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() { // comparator 로부터 상속받아 새로운 클래스를 생성하여
			public int compare(Student o1, Student o2) { // compare 메소드를 오버라이딩 한 후 생성한다.
				if (o1.getAverage() > o2.getAverage()) return 1;
				else if (o1.getAverage() < o2.getAverage()) return -1;
				else return 0;
			}
		});
//		
//		TreeSet set = new TreeSet(new StudentCompare());
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator<Student> it = set.iterator();

		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 69));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 79));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 89));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}
