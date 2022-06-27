package com.bridgrlabz.employee;

public class Employeewagebulider {
	// CONSTANTS
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int wagePerHour = 20;

	public static void main(String[] args) {
		// VARIABLE
		int empHrs = 0;
		int empWage = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case isFullTime:
			empHrs = 8;
			break;
		case isPartTime:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
        }
		empWage = empHrs * wagePerHour;
		System.out.println("Emp wage = " + empWage);

	}

}
