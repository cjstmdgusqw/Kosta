
public class Lotto {

	public static void main(String[] args) {
		// Math.random()
//		for (int i = 0; i < 10; i++) {
//			double rand = Math.random();
//			System.out.println(rand);
//		}
		int[] ball = new int[46];
		for(int i = 0; i<ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for (int i = 0; i < 1000; i++) {
			int ran1 = (int)(Math.random()*46);
			int ran2 = (int)(Math.random()*46);
			if (ran1 != ran2) {
				int temp = ball[ran1];
				ball[ran1] = ball[ran2];
				ball[ran2] = temp;
			}
		}
			
		for (int j = 0; j < 6; j++) {
		    System.out.print(ball[j]+", ");
		    
		}
	}
	
	// 0<= Math.random() < 1
	// 0*46+1 <= Math.random() * 46 + 1 < 1 * 46 + 1
	// (int)1 <= (int)(Math.random()*46+1) < (int)47	
}