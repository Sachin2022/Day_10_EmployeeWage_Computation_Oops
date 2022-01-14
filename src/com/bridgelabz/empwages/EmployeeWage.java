package com.bridgelabz.empwages;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		emopDailyWage();
	}

	static void emopDailyWage() {
		int Is_Full_Time = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee_wage:" + empWage);
	}
}
