package EmployeemanagementSystemProject;

public class Main {

    public static void main(String[] args) {

        EmployeeManagementMethods.fillDB();
        mainMenu();
    }

    public static void mainMenu() {
        EmployeeManagementMethods obj = new EmployeeManagementMethods();
        boolean choice = true;
        UI ui = new UI();

        do {
            System.out.println("Chose your option:");
            System.out.println("1. Employee management (Add, Remove, Update, Search, Display)");
            System.out.println("2. Employee statistics");
            System.out.println("3. Exit");
            System.out.print(">>>>>>>> User choice: ");
            
            double num = obj.tryCatch(1, 3);

            switch ((int) num) {
                case 1:
                    ui.showEmployeeManagementUI();
                    break;
                case 2:
                    ui.showStatisticsUI();
                    break;
                case 3:
                    System.out.println(">>>>>>>> END");
                    choice = false;
                    break;

            }
        } while (choice);
    }
}
