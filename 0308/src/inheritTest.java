class Person{
	int age;
	String name;
	String tel;
	String address;
	
	Person(){}  // 자식이 부모를 생성한다는 것 이거 없으면 밑에 Student부분이 오류남
	Person(String name, int age, String tel, String address){
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "이름:"+name+", 나이" + age + ", 전화번호:" + tel + ", 주소:" + address;
	}
}

class Student extends Person{
	int grade;
	String major; // 전공
	
	Student(){}
	// 반드시 자식을 책임져야만한다
	Student(String name, int age, String tel, String address, int grade, String major){
	    super(name, age, tel, address); // ---> 명시적으로 super을 통해서 Person생성자를 맥여준것
	    // constructor 1 호출, 자식의 생성자는 이와같이 명시적으로 지정하지 않으면 부모의 기본생성자를 호출한다.
	    this.grade = grade;
	    this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + "학년 :" + grade + ", 전공 :" + major;
	}
}

public class inheritTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20, "010-1111-1111", "서울시 금천구", 1, "철학");
		Student s2 = new Student();
		s2.setName("김길동");
		s2.setAge(23);
		s2.setTel("010-2222-2222");
		s2.setAddress("서울시 관악구");
		s2.setGrade(3);
		s2.setMajor("산업공학");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
