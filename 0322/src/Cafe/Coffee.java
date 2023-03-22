package Cafe;

public class Coffee extends Drink{
	static final int COFFEE_PRICE = 100;
	Coffee(){
		super(COFFEE_PRICE);
	}
	
	@Override
	public String toString() {
		return "커피를 주문하셨습니다.";
	}
}
