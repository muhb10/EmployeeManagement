package EmployeemanagementSystemProject;

public class GraphicDesigners extends Employee {

    private double bonus = 600;

    public GraphicDesigners(String fN, String lN, String bD, String gen, double sala, int ide) {

        super(fN, lN, bD, sala, "Graphic Designers", ide, gen);

    }

    public double getBonus() {

        return bonus;

    }

}
