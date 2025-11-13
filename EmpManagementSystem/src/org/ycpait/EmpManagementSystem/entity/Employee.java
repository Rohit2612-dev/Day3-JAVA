//Base class
package org.ycpait.EmpManagementSystem.entity;


public class Employee {
	
	private static int id;
	private String name;
	private int age;
	private float salary;
	
	//Constructor created
	public Employee(String name, int age, float salary) {
		id++;
		this.name=name;
		this.age=age;
		this.salary=salary;		
	}

	//getter and setter methods are called
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Used showDetails method to display the data.
	public void showDetails() {
		System.out.println("Emp ID: "+ id++);
		System.out.println("Emp Name: "+ this.name);
		System.out.println("Emp Age: "+ this.age);
		System.out.println("Emp Salary: "+ this.salary);
	}
}
