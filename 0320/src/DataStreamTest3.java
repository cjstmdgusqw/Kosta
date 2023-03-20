import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

class Person{
	int age;
	String name;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
}

class Student extends Person{
	String major;
	Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + ":" + major;
	}
}
public class DataStreamTest3 {
	static ArrayList<Person> pers = new ArrayList<>();
	
	static void writePersons() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("pers.data");
			dos = new DataOutputStream(fos);
			dos.writeInt(pers.size()); // 데이터의 갯수 저장
			for (Person p : pers) { // 데이터의 갯수만큼 반복
				if (p instanceof Student) {
					dos.writeChar('S'); // Student이면 S저장
					dos.writeUTF(((Student)p).major);
				} else {
					dos.writeChar('P'); // Person이면 P저장
				}
				dos.writeUTF(p.name); // 이름 저장
				dos.writeInt(p.age); // 나이 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void readPersonos() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("pers.data");
			dis = new DataInputStream(fis);
			
			int cnt = dis.readInt();
			for (int i = 0; i < cnt; i++) {
				char sect = dis.readChar();
				if(sect == 'S') {
					String major = dis.readUTF();
					String name = dis.readUTF();
					int age = dis.readInt();
					pers.add(new Student(name, age, major));
				}else {
					String name = dis.readUTF();
					int age = dis.readInt();
					pers.add(new Person(name, age));
				}
			}
//			String name  = dis.readUTF();
//			int age = dis.readInt();
//			System.out.println(name + ", " + age);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		pers.add(new Person("hong", 24));
		pers.add(new Person("song", 25));
		pers.add(new Person("park", 30));
		pers.add(new Student("kang", 22, "computer"));
		writePersons();
//		readPersonos();
//		for (Person p : pers) {
//			System.out.println(p);
//		}
	}

}
