import java.io.File;

public class FileTest1 {
	
	public static void main(String[] args) {
		File file = new File(".\\file\\news.txt");
		String fileName = file.getName();
		
		System.out.println(fileName);
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0, pos));
		System.out.println(fileName.substring(pos + 1));
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getParent());
		
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
	}

}
