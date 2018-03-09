package EmployeemanagementSystemProject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> emp = new ArrayList<>();
    EmployeeManagementMethods in = new EmployeeManagementMethods();

    public void addEmployee() {

        switch (in.userOccupation()) {
            case 1:
                Manager manager = new Manager(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userSalary(), in.userGender(), in.userEmployeeID());
                emp.add(manager);
                break;
            case 2:
                Secretary secretary = new Secretary(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userGender(), in.userSalary(), in.userEmployeeID());
                emp.add(secretary);
                break;
            case 3:
                Programmer programmer = new Programmer(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userGender(), in.userSalary(), in.userEmployeeID());
                emp.add(programmer);
                break;
            case 4:
                GraphicDesigners graphicDesigners = new GraphicDesigners(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userGender(), in.userSalary(), in.userEmployeeID());
                emp.add(graphicDesigners);
                break;
            case 5:
                Tester tester = new Tester(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userGender(), in.userSalary(), in.userEmployeeID());
                emp.add(tester);
                break;
            case 6:
                Accountant accountant = new Accountant(in.userFirstName(), in.userLastName(), in.userBirthday(), in.userGender(), in.userSalary(), in.userEmployeeID());
                emp.add(accountant);
                break;
        }
        System.out.println("\n>>>>>>>> Employee is added with employee ID: " + (EmployeeManagement.emp.size()) + "\n");
        displayEmployee();

    }

    public static void displayEmployee() {

        System.out.println(">>>>>>>>>>>>>>>> Employee list is displayed <<<<<<<<<<<<<<<<");

        System.out.println(String.format("%-20s %-20s %-20s %-20s %-25s %-20s %-20s", "|Employee ID|", "|First name|", "|Last name|",
                "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));

        for (Employee employee : emp) {

            System.out.println(String.format("%-20.15s %-20.15s %-20.15s %-20.15s %-25.15s %-20.15s %-20.15s", employee.getEmployeeID(),
                    employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));

        }

    }

    public void removeEmployee() {

        System.out.println(">>>>>>>> Enter the epmoyee ID which you want to remove");
        System.out.print(">>>>>>>> User choice: ");
        
        double num = in.tryCatch1(1);
        int count = 0;
        for (Employee employee : emp) {

            if ((employee.getEmployeeID()) == ((int) num)) {
                emp.remove(count);
                break;
            }
            count++;
        }
        System.out.println("\n>>>>>>>> Employee is removed with employee ID: " + (count + 1) + "\n");
        displayEmployee();
    }

    public void updateEmployee() {

        System.out.println(">>>>>>>> Enter the epmoyee ID which you want to update");
        System.out.print(">>>>>>>> User choice: ");
        double num = in.tryCatch1(1);
        for (Employee employee : emp) {
            if ((employee.getEmployeeID()) == ((int) num)) {
                System.out.println("Chose your option:\n1. Update First name");
                System.out.println("2. Update Last name\n3. Update Birthday");
                System.out.println("4. Update Gender");
                System.out.println("5. Update Salary\n6. Update Occupation");
                System.out.print(">>>>>>>> User choice: ");

                double option = in.tryCatch(1, 6);
                sc.nextLine();
                switch ((int) option) {

                    case 1:
                        employee.setFirstName(in.userFirstName());
                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with First Name\n");
                        displayEmployee();
                        break;
                    case 2:
                        employee.setLastName(in.userLastName());
                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with Last Name\n");
                        displayEmployee();
                        break;
                    case 3:
                        employee.setBirthday(in.userBirthday());
                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with Birthday\n");
                        displayEmployee();
                        break;
                    case 4:
                        employee.setGender(in.userGender());
                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with Gender\n");
                        displayEmployee();
                        break;
                    case 5:
                        employee.setSalary(in.userSalary());
                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with Salary\n");
                        displayEmployee();
                        break;
                    case 6:
                        int i = in.userOccupation();
                        if (i == 1) {
                            employee.setOccupation("Manager");
                        } else if (i == 2) {
                            employee.setOccupation("Secretary");
                        } else if (i == 3) {
                            employee.setOccupation("Programmer");
                        } else if (i == 4) {
                            employee.setOccupation("Graphic Designers");
                        } else if (i == 5) {
                            employee.setOccupation("Tester");
                        } else if (i == 6) {
                            employee.setOccupation("Accountant");
                        }

                        System.out.println("\n>>>>>>>> Employee with ID: " + employee.getEmployeeID() + " has been updated with Occupation\n");
                        displayEmployee();
                        break;
                }

                break;
            }
        }

    }

    public void searchEmployee() {

        System.out.println("Chose your option:\n1. Search by FirstName");
        System.out.println("2. Search by LastName\n3. Search by Birthday");
        System.out.println("4. Search by Gender\n5. Search by Salary");
        System.out.println("6. Search by EmployeeID\n7. Search by Occupation");

        System.out.print(">>>>>>>> User choice: ");
        double num = in.tryCatch(1, 7);
        String vari;

        switch ((int) num) {

            case 1:
                vari = in.userFirstName();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getFirstName()).equalsIgnoreCase(vari)) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;
            case 2:
                vari = in.userLastName();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getLastName()).equalsIgnoreCase(vari)) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;
            case 3:
                vari = in.userBirthday();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getBirthday()).equalsIgnoreCase(vari)) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;
            case 4:
                vari = in.userGender();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getGender()).equalsIgnoreCase(vari)) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }

                }
                break;
            case 5:
                double variS = in.userSalary();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getSalary()) == variS) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;
            case 6:
                int variI = in.userEmployeeID();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getEmployeeID()) == variI) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;
            case 7:
                System.out.print(">>>>>>>> Enter Occupation: ");
                vari = sc.nextLine();
                vari = sc.nextLine();
                System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s", "|Employee ID|", "|First name|", "|Last name|",
                        "|Date of Birth|", "|Gender|", "|Salary|", "|Occupation|"));
                for (Employee employee : emp) {
                    if ((employee.getOccupation().equalsIgnoreCase(vari))) {
                        System.out.println(String.format("%-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s %-15.10s", employee.getEmployeeID(),
                                employee.getFirstName(), employee.getLastName(), employee.getBirthday(), employee.getGender(), employee.getSalary(), employee.getOccupation()));
                    }
                }
                break;

        }

    }

}
