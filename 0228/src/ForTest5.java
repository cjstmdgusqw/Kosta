
public class ForTest5 {

	public static void main(String[] args) {
		// 우물의 높이는 300
		// 달팽이가 하루에 이동할 수 있는 거리 55cm
		// 달팽이는 5m를 이동후에는 반드시 자야한다 자는동안은 미끄러져서 13cm내려감
		// 달팽이가 우물을 탈출하는 데 몇일이 걸리는가?
		int A = 0;
		int day = 0;
		for (int i = 0; ; i++) {
			A += 55;
			day++;
			if(A > 300) {
				break;
			}
			A -= 13;
		}System.out.println(day);
	}
}
