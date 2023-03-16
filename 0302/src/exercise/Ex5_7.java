package exercise;

import java.util.Scanner;

public class Ex5_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			for(int i=0;i<coinUnit.length;i++) {
				int coinNum = 0;
				if(money / coinUnit[i] >= coin[i]) {
					money = money - (coinUnit[i] * coin[i]);
					coinNum = 5;
					coin[i] = coin[i] - coinNum;
				}else if(money / coinUnit[i] < coin[i]) {
					coinNum = (money / coinUnit[i]);
					money = money - (coinUnit[i] * (money / coinUnit[i]));
					coin[i] = coin[i] - coinNum;
				}
       		System.out.println(coinUnit[i]+"원: "+coinNum);
			}
			if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
	}

}
