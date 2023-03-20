import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("input.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요 반갑습니다");
			bw.newLine();
			bw.write("오늘은 3월 20일입니다");
			bw.newLine();
			bw.write("길가에 개나리가 피기시작했음");
			bw.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}finally { 
			try {
				if(bw!= null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
