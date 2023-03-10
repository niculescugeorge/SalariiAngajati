package com.niculescu;

public class Seller extends Employee{
    private double fixPart = 0.2 * 150;


    Seller(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    public double calculateSalary() {
        return fixPart + reference;
    }

    @Override
    public String getName() {
        return "Vanzatorul se numeste " + firstName + " " + lastName;
    }
}
