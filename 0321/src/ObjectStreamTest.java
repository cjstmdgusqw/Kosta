

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Pers.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new Person("홍길동", 20));
			oos.writeObject(new Person("김길동", 25));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
