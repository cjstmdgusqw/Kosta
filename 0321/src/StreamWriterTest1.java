import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamWriterTest1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream("test.txt");
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			bw.write("안녕하세요? 반갑습니다.");
			bw.newLine();
			bw.write("오늘은 3월 21일입니다");
			bw.newLine();
			bw.write("따뜻한 봄이 기대가 됩니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) bw.close();
			}catch(IOException e){
				e.printStackTrace(); 
			}
		}
	}

}
