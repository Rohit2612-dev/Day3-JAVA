//subclass: Developer
package org.ycpait.EmpManagementSystem.entity;


public class Developer extends Employee{
	
	private int bonus;
	
	//Constructor created for Developer class
	public Developer(String name, int age, float salary, int bonus) {
		super(name, age, salary);
		this.bonus=bonus;
	}

	//Getter and Setter created
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	//Method create to calculate salary with bonus
	public double calculateSalary() {
		return getSalary() + bonus;
	}
	
	@Override
	//Method created to display Developer details
	public void showDetails() {
		System.err.println("Developer Details:-");
		super.showDetails();
		System.out.println("Bonus: "+ bonus);
		System.out.println("Total Salary: "+ calculateSalary());
	}
}
