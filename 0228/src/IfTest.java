public class IfTest {

	public static void main(String[] args) {
		int kor = 97, eng = 85, math = 95;
		int total = kor + eng + math;
		double avg = Math.round(total/(double)3 * 1000) / 1000d;
		// System.out.println(avg);
		
		String grade = "";
		if(avg >= 90) {
			grade = "A";
			if(avg >= 98) {
				grade += "+";
			}else if(avg <= 94) {
				grade += "-";
			}
		}else if(avg >= 80) {
			grade = "B";
			if(avg >= 88) {
				grade += "+";
			}else if(avg <= 84) {
				grade += "-";
			}
		}else if(avg >= 70) {
			grade = "C";
			if (avg >= 78) {
				grade += "+";
			}else if(avg <= 74) {
				grade += "-";
			}
		}else if(avg >= 60) {
			grade = "D";
			if (avg >= 68) {
				grade += "+";
			}else if(avg <= 64) {
				grade += "-";
			}
		}else {
			grade = "E";
		}
		System.out.println("평균점수가 " + avg + "인 경우 학점은 " + grade + "이다");
	}
}
