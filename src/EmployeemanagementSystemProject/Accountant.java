package EmployeemanagementSystemProject;

public class Accountant extends Employee {

    private double bonus = 400;

    public Accountant(String fN, String lN, String bD, String gen, double sala, int ide) {

        super(fN, lN, bD, sala, "Accountant", ide, gen);

    }

    public double getBonus() {

        return bonus;

    }

}
