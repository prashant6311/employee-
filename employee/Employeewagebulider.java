package com.bridgrlabz.employee;

public class Employeewagebulider {

	public static void main(String[] args) {
		// CONSTANTS
		int ISPRESENT = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == ISPRESENT)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is abscent");
	}
}