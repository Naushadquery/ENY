package com.nau;

import java.util.Scanner;

public class EmployeeView {

	private Scanner scanner = new Scanner(System.in);
	private int empCount = 4;
	private Employee[] employees = new Employee[50];
	{
		Employee employee1 = new Employee(1, "nausha", 55);
		Employee employee2 = new Employee(2, "akhtar", 33);
		Employee employee3 = new Employee(3, "ravi", 22);
		Employee employee4 = new Employee(4, "Roy", 22);
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
	}

	public EmployeeView() {
		System.out.println("     Employee Management System");
		while (true) {
			System.out.println("Entering Main Options");
			mainOptions();
			System.out.println("End of some option");
		}
	}

	private void mainOptions() {
		System.out.println("Enter the option from below : ");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employee");
		System.out.println("3. Display Employee with id :");
		System.out.println("4. Update Employee");
		System.out.println("5. Delete Employee");
		System.out.println("6. Exit Application");
		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			addEmployees();
			System.out.println("add employee completeed");
			return;
		}
		case 2: {
			displayEmployees(employees);
			return;
		}
		case 6: {
			System.err.println("End of Application.....");
			System.err.println("Thanks for using the Application.....");
			System.exit(0);
		}
		default:
			System.out.println("Please Select Proper Option");
		}
	}

	private void addEmployees() {
		boolean ans = true;
		do {
			System.out.println("Enter Employee Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter Employee Age : ");
			int age = scanner.nextInt();
			Employee employee = new Employee(id, name, age);
			employees[empCount] = employee;
			empCount++;
			System.out.println("Employees Added....");
			System.out.println("Do you want to continue..... y/n");
			String input = scanner.next();
			if (!input.equalsIgnoreCase("y")) {
				ans = false;
			}
		} while (ans);
		return;
	}

	private void displayEmployees(Employee... employees) {
		if (employees.length != 0) {
			System.out.println("=======================================");
			System.out.println("Id\t:\tName\t:\tAge");
			System.out.println("=======================================");
		}
		for (Employee emp : employees) {
			if (emp != null) {
				System.out.println(emp.getId() + "   \t\t" + emp.getName() + "\t\t" + emp.getAge());
			}
		}
		System.out.println("=======================================");
	}
}
