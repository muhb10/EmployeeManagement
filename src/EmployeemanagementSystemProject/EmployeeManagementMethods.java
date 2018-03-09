package EmployeemanagementSystemProject;

import java.util.Scanner;

public class EmployeeManagementMethods {

    Scanner sc = new Scanner(System.in);

    public String userFirstName() {
        System.out.print(">>>>>>>> Enter the first name: ");

        return sc.nextLine();
    }

    public String userLastName() {
        System.out.print(">>>>>>>> Enter the last name: ");
        return sc.nextLine();

    }

    public String userBirthday() {
        System.out.print(">>>>>>>> Enter birthday (yyyy-mm-dd): ");
        String date = sc.nextLine();

        boolean loop = false;

        do {

            if (date.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})")) {
                loop = false;
            } else {
                System.out.println("!!!!!!!!!!  Invalid input  !!!!!!!!!!");
                System.out.print(">>>>>>>> User choice: ");
                date = sc.nextLine();
                loop = true;
            }
        } while (loop);
        return date;

    }

    public String userGender() {
        System.out.print(">>>>>>>> Enter gender: ");
        String empGen = sc.nextLine();
        while (!((empGen.equalsIgnoreCase("male")) || (empGen.equalsIgnoreCase("female")))) {
            System.out.println("\"!!!!!!!!!!  Invalid input  !!!!!!!!!!\"");
            System.out.print(">>>>>>>> Enter gender: ");
            empGen = sc.nextLine();
        }
        return empGen;

    }

    public double userSalary() {

        System.out.print(">>>>>>>> Enter salary: ");
        double empSal = tryCatch1(1);
        return empSal;

    }

    static public void fillDB() {

        Manager m1 = new Manager("Farrukh", "Raza", "1980-01-01", 34000, "Male", 1);
        Manager m2 = new Manager("Touqeer", "Hassan", "1988-01-01", 33000, "Male", 2);
        Secretary s = new Secretary("Lisa", "Nilsen", "1990-01-01", "Female", 25000, 3);
        Programmer p1 = new Programmer("David", "Krona", "1978-01-01", "Male", 32000, 4);
        Programmer p2 = new Programmer("Anders", "Petersson", "1985-01-01", "Male", 31000, 5);
        Programmer p3 = new Programmer("Erik", "Holmgren", "1983-01-01", "Male", 30000, 6);
        Programmer p4 = new Programmer("Maria", "Petersson", "1975-01-01", "Female", 27000, 7);
        Tester t1 = new Tester("Lord", "Nilsson", "1986-01-01", "Male", 30000, 8);
        Tester t2 = new Tester("Julianna", "Iglesias", "1991-01-01", "Female", 25000, 9);
        Tester t3 = new Tester("Michelina", "Jackson", "1981-01-01", "Female", 28000, 10);
        GraphicDesigners gD1 = new GraphicDesigners("Eva", "Ericsson", "1978-01-01", "Female", 28500, 11);
        GraphicDesigners gD2 = new GraphicDesigners("Sara", "Andersson", "1988-01-01", "Female", 29500, 12);
        Accountant aC1 = new Accountant("Sara", "Johansson", "1988-01-01", "Female", 2200, 13);
        Accountant aC2 = new Accountant("Jhon", "Lundberg", "1991-01-01", "Male", 21500, 14);

        EmployeeManagement.emp.add(m1);
        EmployeeManagement.emp.add(m2);
        EmployeeManagement.emp.add(s);
        EmployeeManagement.emp.add(p1);
        EmployeeManagement.emp.add(p2);
        EmployeeManagement.emp.add(p3);
        EmployeeManagement.emp.add(p4);
        EmployeeManagement.emp.add(t1);
        EmployeeManagement.emp.add(t2);
        EmployeeManagement.emp.add(t3);
        EmployeeManagement.emp.add(gD1);
        EmployeeManagement.emp.add(gD2);
        EmployeeManagement.emp.add(aC1);
        EmployeeManagement.emp.add(aC2);

        EmployeeManagement.displayEmployee();

    }

    public int userEmployeeID() {
        int emplID = 0;
        for (Employee e : EmployeeManagement.emp) {
            if (e.getEmployeeID() > emplID) {
                emplID = e.getEmployeeID();
            }
        }
        return (emplID + 1);
    }

    public int userOccupation() {
        System.out.println("Chose your option:\n1. Manager");
        System.out.println("2. Secretary\n3. Programmer");
        System.out.println("4. Graphic Designers");
        System.out.println("5. Tester\n6. Accountant");
        System.out.print(">>>>>>>> User choice: ");
        double num = tryCatch(0,6);
        return (int) num;

    }
    
    public double tryCatch(int a, int b) {
        
        double num = 0;
        while (true) {
            try {
                num = Double.parseDouble(sc.next());
                while (num < a || num > b) {
                    System.out.println("!!!!!!!!!!  Invalid input  !!!!!!!!!!");
                    System.out.print(">>>>>>>> User choice: ");
                    num = Double.parseDouble(sc.next());
                }
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("!!!!!!!!!!  Invalid input  !!!!!!!!!!");
                System.out.print(">>>>>>>> User choice: ");
            }
        }
        sc.nextLine();
        return num;
    
    }
    public double tryCatch1(int a) {
        
        double num = 0;
        while (true) {
            try {
                num = Double.parseDouble(sc.next());
                while (num < a) {
                    System.out.println("!!!!!!!!!!  Invalid input  !!!!!!!!!!");
                    System.out.print(">>>>>>>> User choice: ");
                    num = Double.parseDouble(sc.next());
                }
                break;
            } catch (NumberFormatException ignore) {
                System.out.println("!!!!!!!!!!  Invalid input  !!!!!!!!!!");
                System.out.print(">>>>>>>> User choice: ");
            }
        }
        sc.nextLine();
        return num;
    
    }

}
