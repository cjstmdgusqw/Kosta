package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest4 {

	public static void main(String[] args) {
		File dir = new File("C:\\SH\\eclipse");
		if(dir.exists() == false || dir.isDirectory() == false) {
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH : mm");
		File[] file = dir.listFiles();
		String attribute = "";
		for (File f : file) {
			String name = f.getName();
			if(f.isDirectory()) {
				attribute = "DIR";
			} else {
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			System.out.printf("%s %3s %d %s\n", 
					df.format(new Date(f.lastModified())),  // lastModified의 return type는 long이다.
					attribute,
					f.length(), 
					name);
		}	
	}
}
