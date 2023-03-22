package Cafe;

public class Coke extends Drink{
	final static int COLE_PRICE = 50;
	Coke(){
		super(COLE_PRICE);
	}
	@Override
	public String toString() {
		return "콜라를 주문하셨습니다"; 
	}
}
