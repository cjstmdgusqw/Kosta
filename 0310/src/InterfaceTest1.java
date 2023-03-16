interface Fightable{
	void attack(); // 추상 메서드만 있어야한다.
}

class Fighter extends Unit implements Fightable {

	@Override
	public void attack() {
		System.out.println("공격하고 있음");
	}

	@Override
	void move(int x, int y) {
		System.out.println("이동하고 있음");
	}
	
}

public class InterfaceTest1 {
	static void attack(Fightable  unit) {
		
	}
	public static void main(String[] args) {
		Fighter fighter = new Fighter();
		fighter.attack();
		fighter.move(0, 0);
		fighter.stop();
		
		Unit fighter2 = new Fighter(); // upcasting
		fighter2.stop();
		fighter2.move(0, 0);
//		fighter2.attack()
		
		Fightable fighter3 = new Fighter(); // interface문도 upcasting 가능.
		fighter3.attack();
//		fighter3.move(0, 0);
//		fighter3.stop();
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		attack(fighter);
//		attack(fighter2); 
		attack(fighter3);
		attack(marine); 
		attack(tank); 
//		attack(dropship); // error
		
		
	}

}
