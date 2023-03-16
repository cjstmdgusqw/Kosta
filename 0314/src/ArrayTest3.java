import java.util.ArrayList;

public class ArrayTest3 {

	public static void main(String[] args) {
        ArrayList<Integer> nlist = new ArrayList<>(); // 제너릭을 씀으로써 object가 아닌 참조타입으로 들어가게 된다. 메모리크기도 달라지고, 그 타입에 맞는 클래스가 만들어진다
        // 그렇지만 클래스는 아님 
        nlist.add(30);
        nlist.add(20);
        nlist.add(10);
        nlist.add(40);
        for (Integer integer : nlist) {
			System.out.println(integer);
		}
        
        ArrayList<Integer> nlist2 = new ArrayList<>(nlist);
		for(Integer n:nlist2) {
			System.out.println(n);
		}
		
		System.out.println(nlist2.contains(nlist));
		Object[] oarr = nlist2.toArray();
		
		Integer[] narr = new Integer[nlist2.size()];
		nlist2.toArray(narr);
		
		for(Integer n : narr) {
			System.out.println(n);
		}
	}

}
