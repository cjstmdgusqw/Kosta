import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> test = new TreeSet<>();
	    test.add(100);
	    test.add(55);
	    test.add(77);
	    
	    
	    //System.out.println(test);
	    
	    TreeSet<String> sset = new TreeSet<>();
	    sset.add("hong");
	    sset.add("park");
	    sset.add("kim");
	    
	    //System.out.println(sset);
	    
	    TreeSet<Person> pset = new TreeSet<>(); // 정렬하는 기능이 들어가있어서 비교하는 함수를 compare이라는 것을 포함했는지 안했는지를 확인해야하고 그 구현 원리에 따라 바꿔야한다 아니다를 판단한다.
	    pset.add(new Person("hong", 25));
	    pset.add(new Person("hing", 34));
	    pset.add(new Person("hing", 15));
	    
	    //System.out.println(pset);
	    
	    
	    TreeSet<Complex> cset = new TreeSet<>(new ComplexCompare());
	    cset.add(new Complex(3,5));
	    cset.add(new Complex(4,7));
	    cset.add(new Complex(2,3));
	    cset.add(new Complex(3,8));
	    
	    System.out.println(cset);
	}

}
