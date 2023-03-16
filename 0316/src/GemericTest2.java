import java.util.Iterator;

class Myclass<E> implements Iterable<E>{  
	E[] arr;
	int capacity = 10;
	int incrementsize = 5;
	int cnt;
	
	@SuppressWarnings("unchecked")
	Myclass(){
//		arr = new E[capacity]; // 배열은 타입이 지정되지 않으면 지정할수 없음
		arr = (E[]) (new Object[capacity]); // 자꾸 까먹는거 배열은 []을 꼭 넣어주자
	}
	
	
	@SuppressWarnings("unchecked")
	Myclass(int capacity) {
		this.capacity = capacity;
		arr = (E[]) (new Object[capacity]);
	}
	
	@SuppressWarnings("unchecked")
	Myclass(int capacity, int incrementsize) {
		this.capacity = capacity;
		this.incrementsize = incrementsize;
		arr = (E[])( new Object[capacity]);
	}
	
	
	@SuppressWarnings("unchecked")
	void add(E data) {
		if(cnt >= capacity) {
			capacity += incrementsize;
			E[] narr = (E[])new Object[capacity + incrementsize];
			System.arraycopy(arr, 0, narr, 0, arr.length);
			arr = narr;
		}
		arr[cnt++]  = data;
	}
	E get (int idx) {
		return arr[idx];
	}
	
	@Override
	public Iterator<E> iterator(){
		return new Iterator<E>() {
			int idx = 0;
			@Override
			public boolean hasNext() {
				return arr[idx] != null;
			}
			
			@Override
			public E next() {
				return arr[idx++];
			}
		};
	}
}
public class GemericTest2 {

	public static void main(String[] args) {
		Myclass<Person> pers = new Myclass<>();
		pers.add(new Person("song", 25));
		Person p = pers.get(0);
		System.out.println(p);
		
		Myclass<Integer> pers2 = new Myclass<>();
		pers2.add(10);
		int p2 = pers2.get(0);
		System.out.println(p2);
		
	    for (Person per : pers) {
	    	System.out.println(per.info());
			
		}
	}
}
