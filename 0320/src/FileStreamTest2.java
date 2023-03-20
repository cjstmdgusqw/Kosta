import java.io.FileReader;
import java.io.IOException;

public class FileStreamTest2 {

	public static void main(String[] args) {
		FileReader fis = null;
		try {
			fis = new FileReader("news.txt"); // FileInputStream과 FileReader의 차이를 보여주는 결과물이다
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
