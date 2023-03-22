package Cafe;

import java.util.Scanner;

class VendingMachineBiz implements IVendingMachineBiz {

	int balance = 1000;
	Drink[] cartlist = new Drink[3];
	int count = cartlist.length;

	Scanner sc = new Scanner(System.in);

	int CAFE() {
		System.out.println("============================");
		System.out.println("[음료수 자판기 관리 시스템]");
		System.out.println("============================");
		System.out.println("1.전체 음료수 및 잔액 보기");
		System.out.println("2.쥬스 구입하기 ( 200원 )");
		System.out.println("3.커피 구입하기 ( 100원 )");
		System.out.println("4.코크 구입하기 ( 50원 )");
		System.out.println("5.구입한 음료수 목록 보기");
		System.out.println("9.종료");
		System.out.println();
		System.out.println("============================");
		System.out.println("메뉴입력 =>");
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	@Override
	public void cartDrink(Drink drink) {
		System.out.println("현재 잔액은" + balance + "원 입니다");

		if (count >= cartlist.length) {
			Drink[] tcart = new Drink[cartlist.length * 3];
			System.arraycopy(cartlist, 0, tcart, 0, cartlist.length);
			cartlist = tcart;
		}
		System.out.print(drink.toString());
		if (balance < drink.getPrice()) {
			System.out.println("잔액부족입니다");
		} else {
			balance -= drink.getPrice();
			System.out.println("현재 잔액은" + balance + "원 입니다");
			cartlist[count++] = drink;
		}
	}

	@Override
	public void printCart() {
		int Coffee = 0;
		int Coke = 0;
		int juice = 0;
		int price = 0;
		for (Drink drink : cartlist) {
			if(drink instanceof Coffee) {
				Coffee += 1;
				price += drink.getPrice();
			} else if(drink instanceof Juice) {
				juice += 1;
				price += drink.getPrice();
			}else if(drink instanceof Coke){
				Coke += 1;
				price += drink.getPrice();
			}
		}
		System.out.println("주스 : " + juice + "개");
		System.out.println("콜라 : " + Coke + "개");
		System.out.println("커피 : " + Coffee + "개");
		System.out.println("총 가격 " + price);
		System.out.println("남은 돈" + balance);
	}

	@Override
	public void printDrinkList(Drink[] drinkList) {
		System.out.println("============================");
		System.out.println("음료수병   가격");
		System.out.println("============================");
		for (Drink drink : drinkList) {
			System.out.println(drink.toString().split("를")[0] + " " +drink.getPrice());
		}
	}
}

public class VendingMachineTest {

	public static void main(String[] args) {
		VendingMachineBiz d = new VendingMachineBiz();
		Drink[] D = new Drink[3];
		D[0] = new Coffee();
		D[1] = new Coke();
		D[2] = new Juice();

		while (true) {
			int num = d.CAFE();
			switch (num) {
			case 1:
				d.printDrinkList(D);
				break;
			case 2:
				d.cartDrink(new Juice());
				break;
			case 3:
				d.cartDrink(new Coffee());
				break;
			case 4:
				d.cartDrink(new Coke());
				break;
			case 5:
				d.printCart();
				break;
			default:
				break;
			}
		}
	}
}
