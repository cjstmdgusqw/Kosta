import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		FileOutputStream fos = null;
		SequenceInputStream sis = null;
		
		try {
			fis1 = new FileInputStream("news.txt");
			fis2 = new FileInputStream("news2.txt");
			sis = new SequenceInputStream(fis1, fis2); // 두 개의 파일을 차례대로 묶어 하나의 inputstream을 생성
			fos = new FileOutputStream("totnews.txt");
			
			byte[] buff = new byte[512];
			int len;
			while((len=sis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sis != null) sis.close();
				if(fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
