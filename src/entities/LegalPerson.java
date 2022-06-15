package entities;

public class LegalPerson extends People {
	
	private int numberEmployees;

	public LegalPerson(String name, double annualIncome, double healthSpending, int numberEmployees) {
		super(name, annualIncome, healthSpending);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
}
