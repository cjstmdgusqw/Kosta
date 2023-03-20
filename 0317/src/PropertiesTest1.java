import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
//		prop.setProperty("id", "10001");
//		prop.setProperty("name", "hong");
//		prop.setProperty("email", "hong@naver.com");
//		prop.setProperty("address", "seoul");
//		
//		try {
//		prop.store(new FileOutputStream("member.txt"),"Member Info");
//		prop.storeToXML(new FileOutputStream("member.xml"),"Member Info");
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
		prop.load(new FileInputStream("member.txt"));
		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("hong@naver.com"));
		System.out.println(prop.getProperty("address"));
		
		prop.load(new FileInputStream("member.xml"));
		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("hong@naver.com"));
		System.out.println(prop.getProperty("address"));
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		 
	}

}
