import java.util.HashMap;

interface Bonus {
	void incentive(int pay);
}

abstract class Employee {
	String name;
	int number;
	String department;
	int salary;

	Employee() {
	}

	Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	abstract double tax();

	@Override
	public String toString() {
		return name + "      " + department + "    " + salary;
	}
}

class Secretary extends Employee implements Bonus {
	Secretary() {
	}

	Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	double tax() {
		double tax = Math.round((salary * 0.10) * 100) / 100.00;
		return tax;
	}

	@Override
	public String toString() {
		if(tax() == 0) {
			System.out.println("name" + "      " + "department" + "  " + "salary");
			return super.toString() + "    ";
		}
		System.out.println("name" + "      " + "department" + "  " + "salary" + "  "+ "tax");
		return super.toString() + "    " +tax();
	}

	@Override
	public void incentive(int pay) {
		salary = (int) (salary + (pay * 0.8));

	}

}

class Sales extends Employee implements Bonus {
	Sales() {
	}

	Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	double tax() {
		double tax = Math.round((salary * 0.13) * 100) / 100.00;
		return tax;
	}

	@Override
	public String toString() {
		if(tax() == 0) {
			return super.toString() + "    ";
		}
		return super.toString() + "    " +tax();
	}

	@Override
	public void incentive(int pay) {
		salary = (int) (salary + (pay * 1.2));
	}
}

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(1, new Secretary("홍길동", 1, "Secretary", 800));
		map.put(2, new Sales("이순신", 2, "Sales", 1200));
		for (Employee string : map.values()) {
			System.out.println((Employee)string);
		}
		System.out.println();
		for (Employee string : map.values()) {
			if (string instanceof Secretary) {
				((Secretary)string).incentive(100);
			} else {
				((Sales)string).incentive(100);
			}
			System.out.println(string);
		}
	}
}
