package com.rakshana.assignment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}