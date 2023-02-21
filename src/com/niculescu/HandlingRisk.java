package com.niculescu;

public class HandlingRisk extends Warehouseman implements EmployeeRisk{

    HandlingRisk(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate, reference);
    }

    @Override
    public void handleRisk() {
        System.out.println("Gestionez marfuri care implica un risk inalt si beneficiez de un spor extra.");
    }

    @Override
    public double calculateSalary() {
        return 3 * reference + monthlyPremium;
    }
}
