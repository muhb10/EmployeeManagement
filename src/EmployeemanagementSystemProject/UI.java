package EmployeemanagementSystemProject;

import java.util.Scanner;

public class UI {
    EmployeeManagementMethods obj = new EmployeeManagementMethods();

    Scanner sc = new Scanner(System.in);

    public void showEmployeeManagementUI() {
        EmployeeManagement e = new EmployeeManagement();
        

        System.out.println("Chose your option:\n1. Add employee");
        System.out.println("2. Remove employee\n3. Update employee");
        System.out.println("4. Search employee");
        System.out.println("5. Display employees\n0. Back to main menu");
        
        double num = obj.tryCatch(0, 5);

        switch ((int) num) {
            case 1:
                e.addEmployee();
                break;
            case 2:

                e.removeEmployee();
                break;
            case 3:
                e.updateEmployee();
                break;
            case 4:
                e.searchEmployee();
                break;
            case 5:
                e.displayEmployee();
                break;
            case 0:
                Main.mainMenu();
                break;
        }
    }
    public void showStatisticsUI() {
        StatisticsMethods e = new StatisticsMethods();
        System.out.println("Chose your option:\n1. Average wage at the company");
        System.out.println("2. Maximum salary in the company\n3. Minimum salary in the company");
        System.out.println("4. Bonus\n5. Women in percentage in the company");
        System.out.println("6. Men percentage of the various work role categories\n0. Back to main menu");
        double num = obj.tryCatch(0, 6);
        switch ((int) num) {

            case 1:
                e.getAverageWage();
                break;
            case 2:
                e.getMaximumSalary();
                break;
            case 3:
                e.getMinimumSalary();
                break;
            case 4:
                e.getTotalBonus();
                break;
            case 5:
                e.getWomenInPercentage();
                break;
            case 6:
                e.getMenRolePercentage();
                break;
            case 0:
                Main.mainMenu();
                break;

        }
    }

}
