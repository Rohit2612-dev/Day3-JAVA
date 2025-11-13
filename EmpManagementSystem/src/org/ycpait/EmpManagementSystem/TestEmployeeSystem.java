package org.ycpait.EmpManagementSystem;

import java.util.Scanner;


import org.ycpait.EmpManagementSystem.entity.Developer;
import org.ycpait.EmpManagementSystem.entity.Employee;
import org.ycpait.EmpManagementSystem.entity.SalesPerson;

public class TestEmployeeSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		SalesPerson sP = null;
		Developer d = null;
		
		int choice= 0;
		do {
			System.out.println("\nEmployee Management System!");
			System.out.println("-------------------------- ");
			System.out.println("1.REGISTER Employee ");
			System.out.println("2.DISPLAY Employee");
			System.out.println("0.EXIT ......");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();			
			switch(choice) {
			case 1:
				e = new Employee("Rohit",22, 500000.00f);
				sP = new SalesPerson("Chiku",23, 30000.0f, 50, 200);
				d = new Developer("Geetu",24, 60000.0f, 10000);
				System.out.println("Registered Successfully! ");
			break;
			
			case 2:
				if(e != null) {
					System.out.println();
					e.showDetails();
					System.out.println("----------------");
					sP.showDetails();
					System.out.println("----------------");
					d.showDetails();
				}
				else {
					System.out.println("No Employee Registered yet!");
				}
				break;
				
			case 0:
                System.out.println("Exiting... Thank you!");
                break;
				
			default:
                System.out.println("Invalid choice! Try again.");
                break;	
			}
			
		}
		while(choice != 0);
		
		sc.close();
	}
}

