import java.util.HashSet;

public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("hong");
		hs.add("park");
		hs.add("song");
		hs.add("hong");
		System.out.println(hs);
		
		HashSet<Person> pers = new HashSet<>();
		pers.add(new Person("hong", 20));
		pers.add(new Person("song", 25));
		pers.add(new Person("park", 30));
		pers.add(new Person("hong", 20));
		
		System.out.println(pers);
		
		HashSet<Complex> coms = new HashSet<>();
		coms.add(new Complex(3,5));
		coms.add(new Complex(7,2));
		coms.add(new Complex(5,6));
		coms.add(new Complex(3,5));
		coms.add(new Complex(5,3));
		coms.add(new Complex(5,6));
		coms.add(new Complex(5,6));
		coms.add(new Complex(7,4));
		
		System.out.println(coms);
		
//		for (Complex com : coms) {
//			System.out.println(com);
//		}

	}

}
