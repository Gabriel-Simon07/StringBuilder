package entities;

public class People {
    private String name;
    private double annualIncome;
    private double healthSpending;

    public People() {}

    public People(String name, double annualIncome, double healthSpending) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.healthSpending = healthSpending;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}
}
