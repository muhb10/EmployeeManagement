package EmployeemanagementSystemProject;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String birthday;
    private double salary;
    private String occupation;
    private int employeeID;
    private String gender;

    private double bonus = 0;

    public Employee(String firstName, String lastName, String birthday, double salary, String occupation, int employeeID, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.salary = salary;
        this.occupation = occupation;
        this.employeeID = employeeID;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", salary=" + salary + ", occupation=" + occupation + ", employeeID=" + employeeID + ", gender=" + gender + "\n";
    }

    public double getBonus() {

        return bonus;

    }

}
