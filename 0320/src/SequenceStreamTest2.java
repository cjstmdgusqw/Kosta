import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest2 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		SequenceInputStream sis = null;
		FileOutputStream fos = null;

		try {
			vector.add(new FileInputStream("news.txt"));
			vector.add(new FileInputStream("news2.txt"));
			vector.add(new FileInputStream("news3.txt"));

			sis = new SequenceInputStream(vector.elements());
			fos = new FileOutputStream("totnews2.txt");

			byte[] buff = new byte[512];
			
			int len;
			while ((len = sis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sis != null) sis.close();
				if (fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
