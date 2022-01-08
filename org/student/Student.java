package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Name is san");
	}
	public void studentDept() {
		System.out.println("dept is AU");
	}
	public void studentId() {
		System.out.println("Id is 66");
	}
	

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentDept();
		stud.studentId();
		stud.studentName();

	}

}
