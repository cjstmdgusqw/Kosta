class SingleArray {
	int[] arry = new int[10];
	int cnt;
	
	private SingleArray() {}
	
	static SingleArray singleArray;
	
	public static SingleArray getReference() {
		singleArray = new SingleArray();
		return singleArray;
	}
	
	public void addData(int data) {
		arry[cnt++] = data;
	}
	public int getData(int idx) {
		return arry[idx];
	}
	public int setData(int data) {
		return arry[cnt++] = data;
	}
}

public class SingleTonTest {

	public static void main(String[] args) {
        SingleArray sa1 = SingleArray.getReference();
        SingleArray sa2 = SingleArray.getReference();
        SingleArray sa3 = SingleArray.getReference();
        System.out.println(sa1 == sa2);
        System.out.println(sa1 == sa3);
		sa1.setData(10);
        System.out.println(sa2.getData(0));
	}

}
