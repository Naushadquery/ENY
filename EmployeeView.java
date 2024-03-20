package com.nau;

import java.util.Scanner;

public class EmployeeView {

	private Scanner scanner = new Scanner(System.in);

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
		System.out.println("      Employee Management System");
		mainOptions();

	}

	private void mainOptions() {
		System.out.println("Enter the option from below : ");
		System.out.println("1. Add Employee");
		System.out.println("2. Display Employee");
		System.out.println("6. Exit Application");
		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			addEmployees();
			mainOptions();
		}
		case 2: {
			displayEmployees(employees);
			mainOptions();
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
		System.out.println("Employees Added....");
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
