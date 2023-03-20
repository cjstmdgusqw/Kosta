package Exercise11_9;

import java.util.*;

class Student implements Comparable<Student>{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return o.total - this.total;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank // 새로추가
		;
	}

} // class Student

class ClassTotalComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.total - o1.total;
	}
}

class Exercise11_9 {
	public static void calculateClassRank(List<Student> list) {
// 먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator());
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		int samework =  0;
		
		Iterator it = list.iterator();
		
	
		/*
		 * (2) 아래의 로직에 맞게 코드를 작성하시오. 1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다. 1.1 반이
		 * 달라지면,(ban과 prevBan이 다르면) 이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화 한다. 1.2
		 * 총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를 등수(schoolRank)로 한다. 1.3 총점이
		 * 서로 다르면, 등수(schoolRank)의 값을 알맞게 계산해서 저장한다. 이전에 동점자였다면, 그 다음 등수는 동점자의 수를
		 * 고려해야한다. (실행결과 참고) 1.4 현재 반과 총점과 등수를 이전 반(prevBan), 이전 총점(prevTotal), 이전
		 * 등수(prevRank)에 저장한다.
		 */
	} // public static void calculateClassRank(List list) {

	public static void calculateSchoolRank(List list) {
		/* 내용 생략 */
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		calculateSchoolRank(list);
		calculateClassRank(list);
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
