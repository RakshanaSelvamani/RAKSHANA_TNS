package com.rakshana.assignment;
import com.rakshana.assignment.employees.Manager;
import com.rakshana.assignment.employees.Developer;
import com.rakshana.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	    public static void main(String[] args) {
	        Manager manager = new Manager();
	        manager.setName("Ayan S");
	        manager.setEmployeeId("5220365");
	        manager.setGrade("A");
	        manager.setSalary("9.5%");
	        manager.setDepartment("Sales");

	        // Create Developer instance
	        Developer developer = new Developer();
	        developer.setName("Samira T");
	        developer.setEmployeeId("1002642");
	        developer.setGrade("B");
	        developer.setSalary("7.8%");
	        developer.setProgrammingLanguage("Java");

	        // Display details using utility
	        System.out.println("Manager Details:");
	        EmployeeUtilities.displayEmployeeDetails(manager);

	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.displayEmployeeDetails(developer);
	    }
	}


