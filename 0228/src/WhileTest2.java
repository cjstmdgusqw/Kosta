public class WhileTest2 {

	public static void main(String[] args) {
		int i = 2, j = 1;
		while (i <= 9) {
			while(j <= 9) {
				System.out.println(i + "x" + j + "=" +i * j);
				j++;
			}
			i++;
			j = 1;
		}
	}
}
