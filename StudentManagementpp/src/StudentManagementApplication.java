
import java.util.Scanner;

import org.studentmanagementapp.Student;

public class StudentManagementApplication {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Number of Students registered are :"+Student.getCount());
		//1. create a reference of Student type
		Student s=null;
		Student[] students = new Student[2];
		int indexCount=0;

		do {
			System.out.println("Welcome to Student Management App:");
			System.out.println("==================================");
			System.out.println("1. Register new Employee");
			System.out.println("2. Display Details");
			System.out.println("-1. Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println(indexCount);
				System.out.println(Student.getCount());
				if(indexCount <= students.length) {
					students[indexCount] = new Student(1, "Haaji", 77.77f);
					indexCount++;
				}
				else {
					System.err.println("Limit Exceeded");
				}
				break;
			
			case 2: 
				for(Student stu : students) {
				if(s!=null)
					//s.display();
					System.out.println(s);
				}
				break;
			
			case -1: {
				
				break;
			}
			default:
				System.out.println("Select correct choice");
				break;
			}
		}while(choice!=-1);
		System.out.println("Program Exit Successful");
	}
}