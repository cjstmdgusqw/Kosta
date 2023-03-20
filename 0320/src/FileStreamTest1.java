import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; // 변수선언을 하는 이유는 finally에 값을 넣기위해서!
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("news.txt"); // 입력용 데이터 이파일을 읽어서 --> input
			fos = new FileOutputStream("copy.txt");  // 밑에다가 복사를 할려고하는 것 (파일생성) -- >OutPut
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte[] buff = new byte[512];
			int len;
			while((len = bis.read(buff)) > 0) { // 실제읽은 데이터의 길이를return해줘서 남은길이만큼만 출력을해줘서 읽어준다.
				bos.write(buff, 0, len);
			}
//			int data;
//			while((data = fis.read()) != -1) { // 모든파일에는 마지막에 -1이 들어가져 있다.  끝에는 -1이 무조건 존재를하기 때문에 -1이 나오기까지 그렇게 한다
//				fos.write(data);
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close(); // 무조건 닫아줘야 한다. 
				if(bos!=null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
