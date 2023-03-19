package practice11;

import java.util.*;

class Student2 implements Comparable<Student2> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Student2 o) {
		
		return 0;
	}
} // class Student

class Exercise11_6 {
	static int getGroupCount(TreeSet<Student2> tset, int from, int to) {
		Student2 s1 = new Student2("from",0,0,from,from,from);
		Student2 s2 = new Student2("to", 0,0, to,to,to);
		return (tset.subSet(s1, s2)).size();
	}

	public static void main(String[] args) {
		TreeSet<Student2> set = new TreeSet<>(new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				return o1.getTotal() - o2.getTotal();
			}
		});
		set.add(new Student2("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student2("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student2("김자바", 1, 3, 80, 80, 90));
		set.add(new Student2("이자바", 1, 4, 70, 90, 70));
		set.add(new Student2("안자바", 1, 5, 60, 100, 80));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
}