import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class HexaViewer {

	public static void main(String[] args) {
//		PrintStream ps = null;
		int cnt = 0;
		FileInputStream fos = null;
		try {
			fos = new FileInputStream("./bin/printStreamTest1.class");
			//ps = new PrintStream(fos);
			int data;
			while((data = fos.read())!= -1) {
				System.out.printf("%02X ",data);
				cnt++;
				if(cnt % 16 == 0) {
					System.out.println();
				}
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}

	}

}
