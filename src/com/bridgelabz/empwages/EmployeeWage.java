package com.bridgelabz.empwages;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		attendanceCheck();
	}

	static void attendanceCheck() {
		int isFullTime = 1;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}

}
