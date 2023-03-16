
public class SwitchTest {

	public static void main(String[] args) {
		int kor = 100, eng = 100, math = 100;
		int total = kor + eng + math;
		double avg = Math.round(total/(double)3 * 1000) / 1000d;
		System.out.println(avg);
		
		String grade = "";
		switch ((int)(avg/10)) {
		case 10: //10 이거나 9이면 생략 가능!! 뒤에거에만 조건붙여도 좋다
		case 9: {
			grade = "A"; 
			if(avg >= 98) {
				grade +="+";
			}else if(avg <= 94) {
				grade+="-";
			}
			break;
		}
		case 8: {
			grade = "B"; 
			if(avg >= 88) {
				grade +="+";
			}else if(avg <= 84) {
				grade+="-";
			}
			break;
		}
		case 7: {
			grade = "C";
			if(avg >= 78) {
				grade +="+";
			}else if(avg <= 74) {
				grade+="-";
			}
			break;
		}
		case 6 : {
			grade = "D";
			if(avg >= 68) {
				grade +="+";
			}else if(avg <= 64) {
				grade+="-";
			}
			break;
		}
		default : grade = "F";
		}
		System.out.print(grade);
	}

}
