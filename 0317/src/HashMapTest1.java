import java.util.HashMap;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String, Person> pers = new HashMap<>();
		pers.put("hong@naver.com", new Person("hong", 20));
		pers.put("song@gmail.net", new Person("송길동", 25));
		pers.put("lee@gmail.net", new Person("이길동", 30));
		
		Person p = pers.get("lee@gmail.net");
//		System.out.println(p);
		
		HashMap pers2 = new HashMap<>();
		pers2.put("hong@naver.com", new Person("hong", 20));
		pers2.put("song@gmail.net", new Person("송길동", 25));
		pers2.put("lee@gmail.net", new Person("이길동", 30));
		
		
		Person p2 = (Person)pers2.get("lee@gmail.net");
		
		
		System.out.println(p2);
		
		for(Person a : pers.values()) {
			System.out.println(a);
		}
		System.out.println();
		
		pers.remove("hong@naver.com");
		
		for (String key : pers.keySet()) {
			System.out.println(pers.get(key));
		}
		
		if(pers.containsKey("lee2@daum.net") == false) {
			pers.put("lee@daum.net", new Person("이길동2", 30));
		}
		
		for (String key : pers.keySet()) {
			System.out.println(pers.get(key));
		}
	}

}
