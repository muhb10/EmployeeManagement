package EmployeemanagementSystemProject;

public class Programmer extends Employee {

    private double bonus = 800;

    public Programmer(String fN, String lN, String bD, String gen, double sala, int ide) {
        super(fN, lN, bD, sala, "Programmer", ide, gen);

    }

    public double getBonus() {

        return bonus;
    }
}
