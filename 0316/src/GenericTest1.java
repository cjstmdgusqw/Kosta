class MyArray{
	Object[] arr;
	int capacity = 10;
	int incrementssize = 5;
	int cnt;
	MyArray(){
		arr = new Object[capacity];
	}
	
	MyArray(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
	}
	
	MyArray(int capacity, int incrementssize) {
		this.capacity = capacity;
		this.incrementssize = incrementssize;
		arr = new Object[capacity];
	}
	
	void add(Object data) {
		if (capacity <= cnt) {
			capacity += incrementssize;
			Object[] narr = new Object[capacity + incrementssize];
			System.arraycopy(arr, 0, narr, 0, arr.length);
			arr = narr;
		}
		arr[cnt++] = data;
	}
	
	Object get(int idx){
		return arr[idx];
	}
}

public class GenericTest1 {
    public static void main(String[] args) {
    	MyArray marr = new MyArray();
    	marr.add(new Person("hong", 10));
    	marr.add(new Person("tmdgus", 20));
    	for (int i = 0; i < marr.cnt; i++) {
    		Person p = (Person)marr.get(i);
    		System.out.println(p.info());
		}
    }
}
