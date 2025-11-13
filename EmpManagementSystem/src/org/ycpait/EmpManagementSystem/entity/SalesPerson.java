//Subclass: SalesPerson
package org.ycpait.EmpManagementSystem.entity;

public class SalesPerson extends Employee{
	private int sales;
	private int CommissionPerSale;
	
	//Created Constructor
	public SalesPerson(String name, int age, float salary, int sales, int commissionPerSale) {
		super(name, age, salary);
		this.sales = sales;
		CommissionPerSale = commissionPerSale;
	}
	
	//Getter and Setter method created
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getCommissionPerSale() {
		return CommissionPerSale;
	}
	public void setCommissionPerSale(int commissionPerSale) {
		CommissionPerSale = commissionPerSale;
	}
	
	public double calculateSalary() {
		return getSalary() + (sales*CommissionPerSale);
	}
	
	@Override
	public void showDetails() {
		System.out.println("Sales Person Details:");
		super.showDetails();
		System.out.println("Total Sales: "+ sales);
		System.out.println("Commission Per Sale: "+ CommissionPerSale);
		System.out.println("Total Salary: "+ calculateSalary());
	}
}
