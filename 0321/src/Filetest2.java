import java.io.File;

public class Filetest2 {

	public static void main(String[] args) {
		File f = new File("C:\\SH\\eclipse");
		
		if(f.exists() == false || f.isDirectory() == false) {
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}
		
		File[]  fileList = f.listFiles();
		int dicCnt = 0;
		int totsize = 0;
		for (File file : fileList) {
			if(file.isDirectory()) dicCnt++;
			totsize += file.length();
			String filename = file.getName();
			System.out.println(file.isDirectory()? "{" + filename + "}" : filename);
		}

	}

}
