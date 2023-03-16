package Exercise;

class StudaCard{
	int num;
	boolean isKwang;
	
	StudaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	StudaCard(){
		num = 1;
		isKwang = true;
	}
	
	String info(){
		return num + (isKwang == true? "K" : " "); 
	}
}

public class Ex6_2 {

	public static void main(String[] args) {
		StudaCard card1 = new StudaCard(3, false);
		StudaCard card2 = new StudaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}


