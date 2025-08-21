package com.rakshana.assignment;
	import java.util.Scanner;

	// Student class with default constructor
	class Student {
	    public Student() {
	        System.out.println("Student object is created");
	    }
	}

	// Commission class to handle sales logic
	class Commission {
	    private String name;
	    private String address;
	    private String phone;
	    private double salesAmount;

	    public void acceptDetails() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        name = scanner.nextLine();

	        System.out.print("Enter address: ");
	        address = scanner.nextLine();

	        System.out.print("Enter phone number: ");
	        phone = scanner.nextLine();

	        System.out.print("Enter sales amount: ");
	        salesAmount = scanner.nextDouble();
	    }

	    public void calculateCommission() {
	        double commission;

	        if (salesAmount >= 100000) {
	            commission = 0.10 * salesAmount;
	        } else if (salesAmount >= 50000) {
	            commission = 0.05 * salesAmount;
	        } else if (salesAmount >= 30000) {
	            commission = 0.03 * salesAmount;
	        } else {
	            commission = 0;
	        }

	        System.out.println("\n--- Employee Details ---");
	        System.out.println("Name     : " + name);
	        System.out.println("Address  : " + address);
	        System.out.println("Phone    : " + phone);
	        System.out.println("Sales    : " + salesAmount);
	        System.out.println("Commission: " + commission);
	    }
	}

