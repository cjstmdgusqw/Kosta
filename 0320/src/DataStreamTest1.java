import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		String name = "hong";
		int age = 20;
		double height = 17;
		
		try {
			fos = new FileOutputStream("Person.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			 try {
				if(dos!= null) dos.close();
			 } catch(IOException e) {
				e.printStackTrace();
			 }
		}
	}

}
