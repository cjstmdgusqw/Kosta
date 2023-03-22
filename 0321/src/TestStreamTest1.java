import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

class Person implements Serializable{
	int age;
	String name;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
}

class Student extends Person implements Serializable{
	String major;
	Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + ":" + major;
	}
}
public class TestStreamTest1 {
	static ArrayList<Person> pers = new ArrayList<>();
	static void savePers() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("pers.txt");
			bw = new BufferedWriter(fw);
			for (Person p : pers) {
				String pstr = "";
				pstr += p.name;
				pstr += "," + p.age;
				if (p instanceof Student) {
					pstr+=  ", " + ((Student) p).major;
				}
				bw.write(pstr);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
	static void loadPers() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("pers.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
			     String[] arr = line.split(",");
			     String name = arr[0];
			     int age = Integer.parseInt(arr[1]);
			     if(arr.length == 3) {
			    	 String major = arr[2];
			    	 pers.add(new Student(name, age, major));
			     }else {
			    	 pers.add(new Person(name, age));	 
			     }
			     
			}
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
//		pers.add(new Person("홍길동", 20));
//		pers.add(new Person("김길동", 25));
//		pers.add(new Student("고길동", 30, "심리학"));
//		savePers();
		
		loadPers();
		for (Person p: pers) {
			System.out.println(p);
		}
	}

}
