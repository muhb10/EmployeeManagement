package EmployeemanagementSystemProject;

public class StatisticsMethods {

    EmployeeManagementMethods getEmploy = new EmployeeManagementMethods();
    java.util.Scanner sc = new java.util.Scanner(System.in);

    public void getAverageWage() {
        double avergae = 0;
        int count = 0;
        for (Employee e : EmployeeManagement.emp) {
            avergae += e.getSalary();
            count++;
        }
       
        System.out.printf(">>>>>>>> Average Wage in the company is: %.2f\n", (avergae / EmployeeManagement.emp.size()));
    }

    public void getMaximumSalary() {
        double max = 0;

        for (Employee e : EmployeeManagement.emp) {
            if (e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        System.out.printf(">>>>>>>> Maximum Salary in the company is: %.2f\n", (max));
    }

    public void getMinimumSalary() {

        double min = EmployeeManagement.emp.get(0).getSalary();

        for (Employee e : EmployeeManagement.emp) {
            if (e.getSalary() < min) {
                min = e.getSalary();
            }
        }
        System.out.printf(">>>>>>>> Minimum Salary in the company is: %.2f\n", (min));
    }

    public void getTotalBonus() {
        double totalBonus = 0;
        System.out.println("Chose your option:");
        System.out.println("1. Total Bonus");
        System.out.println("2. Bonus by catagories");
        System.out.print(">>>>>>>> User choice: ");
        double num = getEmploy.tryCatch(1, 2);

        switch ((int) num) {
            case 1:

                for (Employee e : EmployeeManagement.emp) {

                    totalBonus += e.getBonus();
                }
                System.out.printf("\n>>>>>>>> Total bonus is: %.2f\n", totalBonus );
                break;
            case 2:
                totalBonus = 0;
                System.out.println("Chose your option:");
                System.out.println("1. Manager\n2. Secretary");
                System.out.println("3. Programmer\n4. Tester");
                System.out.println("5. Graphic Designer\n6. Accountant");
                System.out.print(">>>>>>>> User choice: ");
                double input = getEmploy.tryCatch(1, 6);
               
                int input1 = (int)input;
                for (Employee e : EmployeeManagement.emp) {
                    if ((e instanceof Manager) && (input1 == 1)) {
                        totalBonus += e.getBonus();
                    }
                    if ((e instanceof Secretary) && (input1 == 2)) {
                        totalBonus += e.getBonus();
                    }
                    if ((e instanceof Programmer) && (input1 == 3)) {
                        totalBonus += e.getBonus();
                    }
                    if ((e instanceof Tester) && (input1 == 4)) {
                        totalBonus += e.getBonus();
                    }
                    if ((e instanceof GraphicDesigners) && (input1 == 5)) {
                        totalBonus += e.getBonus();
                    }
                    if ((e instanceof Accountant) && (input1 == 6)) {
                        totalBonus += e.getBonus();
                    }
                }
                System.out.printf("\n>>>>>>>> Total bonus in catagory" + " " + input1 + " is %.2f\n", totalBonus );
                break;
        }

    }

    public void getWomenInPercentage() {

        double count = 0;

        for (Employee e : EmployeeManagement.emp) {
            if (e.getGender().equalsIgnoreCase("female")) {
                count++;
            }
        }
        System.out.printf(">>>>>>>> Women in Percentage in the company is: %.2f", ((count / EmployeeManagement.emp.size()) * 100));
        System.out.print(" %\n");
    }

    public void getMenRolePercentage() {

        double catgoryCount = 0, maleCount = 0;

        int empl = getEmploy.userOccupation();

        for (Employee e : EmployeeManagement.emp) {

            if ((empl == 1) && (e.getOccupation().equalsIgnoreCase("Manager"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            } else if ((empl == 2) && (e.getOccupation().equalsIgnoreCase("Secretary"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            } else if ((empl == 3) && (e.getOccupation().equalsIgnoreCase("Programmer"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            } else if ((empl == 4) && (e.getOccupation().equalsIgnoreCase("Graphic Designers"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            } else if ((empl == 5) && (e.getOccupation().equalsIgnoreCase("Tester"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            } else if ((empl == 6) && (e.getOccupation().equalsIgnoreCase("Accountant"))) {
                if ((e.getGender().equalsIgnoreCase("Male"))) {
                    maleCount++;
                }
                catgoryCount++;
            }
        }
        System.out.printf("\n>>>>>>>> Male in catagory: " + empl + " are %.2f", (100 * (maleCount / catgoryCount)));
        System.out.println(" %\n");
    }
}
