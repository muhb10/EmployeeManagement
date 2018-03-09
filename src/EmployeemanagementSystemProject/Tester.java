package EmployeemanagementSystemProject;

public class Tester extends Employee {

    private double bonus = 700;

    public Tester(String fN, String lN, String bD, String gen, double sala, int ide) {

        super(fN, lN, bD, sala, "Tester", ide, gen);

    }

    public double getBonus() {

        return bonus;

    }
}
