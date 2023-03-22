
public class TestMain03 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		String[] arr = str.split(",");
		double add = 0;
		for (String p : arr) {
			Float f = Float.parseFloat(p);
			add += f;	
		}
		double result = Math.round(add * 1000) / 1000d;
		System.out.printf("합계 : %.3f",  result);
		System.out.println();
		float avg = (float) (result / arr.length); 
		System.out.println("평균 : " + avg);
	}

}
