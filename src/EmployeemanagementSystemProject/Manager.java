package EmployeemanagementSystemProject;

public class Manager extends Employee {

    private double bonus = 1000;

    public Manager(String fN, String lN, String bD, double sala, String gen, int ide) {
        super(fN, lN, bD, sala, "Manager", ide, gen);

    }

    public double getBonus() {

        return bonus;
    }

}
