abstract class Plane{
	String planeName;
	int fuelSize;
	Plane(){}
	Plane(String planeName, int fuelSize){
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	void refuel(int fuel) {
		fuelSize = fuelSize + fuel;
	}
	abstract void flight(int distance);
}
class Airplane extends Plane{
	Airplane(){}
	Airplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}

	
	@Override
	public String toString() {
		return "이름 : " + planeName + "연료량 : " + fuelSize;
	}
	@Override
	void flight(int distance) {
		fuelSize = fuelSize - 5 * distance;
		
	}
}

class Cargoplane extends Plane{
	Cargoplane() {}
	Cargoplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	@Override
	public String toString() {
		return "이름 : " + planeName + "연료량 : " + fuelSize;
	}
	@Override
	void flight(int distance) {
		fuelSize = fuelSize - 3 * distance;
	}
}
public class PlaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane();
		a.planeName = "L777";
		a.fuelSize = 1000;
		Cargoplane C = new Cargoplane();
		C.planeName = "C50";
		C.fuelSize = 1000;
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(C);
		a.flight(100);
		C.flight(100);
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(C);
		a.refuel(200);
		C.refuel(200);
		System.out.println("Plane fuelSize");
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(C);
		
		
	}

}
