package com.niculescu;

public class Warehouseman extends Employee{

    public Warehouseman(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    public double calculateSalary() {
        return 2.5 * reference;
    }

    @Override
    public String getName() {
        return "Angajatul care gestioneaza marfuri se numeste " + firstName + " " + lastName;
    }
}
