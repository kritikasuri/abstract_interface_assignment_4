package com.acadgild.assignment.abstracts.student;

public class student_detail extends student  {
	
	public student_detail(String name, int roll, int reg){
		this.name = name;
		this.roll_nbr = roll;
		this.registration_nbr = reg;
	}

	@Override
	public void display() {
		System.out.println("Student Details are as follows :");
		System.out.println("Name : "+this.name);
		System.out.println("Roll Number : "+this.roll_nbr);
		System.out.println("Registration Number : "+this.registration_nbr);
	}

}
