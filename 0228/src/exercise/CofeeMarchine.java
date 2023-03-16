package exercise;

import java.util.Scanner;

public class CofeeMarchine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu, Money;
		int coin500 = 0, coin100 = 0, coin50 = 0;
        while(true) {
        	System.out.println("[KOSTA CAFE]");
        	System.out.println("0. 종료");
        	System.out.println("1. Coffee(350원)");
        	System.out.println("2. Milk(250원)");
        	System.out.println("3. HotChoco(400원)");
        	System.out.print("선택>>");
        	menu = sc.nextInt();
        	if(menu == 0)break;
        	System.out.print("돈을 입려해주세요>>");
        	Money = sc.nextInt();
        	System.out.println("잔돈 : "); // 잔돈 : 500(1개), 100(1개), 50(1개)
        	
        	int remain = 0;
        	switch(menu) {
        	case 1: remain = Money - 350; break;
        	case 2: remain = Money - 250; break;
        	case 3: remain = Money - 400; break;
        	}
        	System.out.println(remain);
        	coin500 = remain / 500;
        	
    		coin100 = (remain % 500)/100;
    		coin50 = ((remain % 500)%100)/50;
        	
        	
//        	if (menu == 1) {
//        		coin500 = (1000-Money) / 500;
//        		coin100 = ((1000-Money) % 500)/100;
//        		coin50 = (((1000-Money) % 500)%100)/50;
//        	}else if(menu == 2) {
//        		coin500 = (1000-Money) / 500;
//        		coin100 = ((1000-Money) % 500)/100;
//        		coin50 = (((1000-Money) % 500)%100)/50;
//        	}else if(menu == 3) {
//        		coin500 = (1000-Money) / 500;
//        		coin100 = ((1000-Money) % 500)/100;
//        		coin50 = (((1000-Money) % 500)%100)/50;
//        	}else if(menu == 0) {
//        		break;
//        	}
        	
        	System.out.println("잔돈 : " + "500 : " + coin500 + "개 100 : " + coin100 + "개 50 : " + coin50 + "개" );
        }

	}

}
