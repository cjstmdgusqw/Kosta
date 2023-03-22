import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamTest3 {
	static ArrayList<Person> pers = new ArrayList<>();
	
	static void savePers() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("pers.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeInt(pers.size());
			for (Person p : pers) {
				oos.writeObject(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void loadPers() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("pers.ser");
			ois = new ObjectInputStream(fis);
			int size = ois.readInt();
			for (int i = 0; i < size; i++) {
				Object obj = ois.readObject();
				if(obj instanceof Student) {
					pers.add((Student)obj);
				} else {
					pers.add((Person)obj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		pers.add(new Person("홍길동", 20));
		pers.add(new Person("고길동", 24));
		pers.add(new Student("김길동", 25, "심리학"));
		
		savePers();
//		loadPers();
//		for (Person p : pers) {
//			System.out.println(p);
//		}

	}

}
