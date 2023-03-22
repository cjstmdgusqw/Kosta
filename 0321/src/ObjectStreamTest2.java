import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("pers.ser");
			ois = new ObjectInputStream(fis);
			Person p = (Person)ois.readObject();
			System.out.println(p);
			p = (Person)ois.readObject();
			System.out.println(p);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
