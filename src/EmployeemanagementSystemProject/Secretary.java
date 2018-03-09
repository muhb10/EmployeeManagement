package EmployeemanagementSystemProject;

public class Secretary extends Employee {

    private double bonus = 500;

    public Secretary(String fN, String lN, String bD, String gen, double sala, int ide) {

        super(fN, lN, bD, sala, "Secretary", ide, gen);

    }

    public double getBonus() {

        return bonus;
    }

}
