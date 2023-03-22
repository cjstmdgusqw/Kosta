import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			File file = new File("pers.txt");
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, "KSC5601");
			br = new BufferedReader(isr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e){
				e.printStackTrace();
			}finally {
				try {
					if(br != null) br.close();
				}catch(IOException e) {
					e.printStackTrace();
			}
		}
	}
}
