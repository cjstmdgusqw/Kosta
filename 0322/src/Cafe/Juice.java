package Cafe;

public class Juice extends Drink{
	static final int Juice_PRICE = 200;
	Juice(){
		super(Juice_PRICE);
	}
	@Override
	public String toString() {
		return "쥬스를 구입했습니다";
	}
	
	
}
