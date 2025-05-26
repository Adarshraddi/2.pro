
class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, int empId, double salary) {
        super(name);
        this.empId = empId;
        this.salary = salary;
    }
     public void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}
public class personClass {
    public static void main (String[] args) {
        // Hardcoded input using constructors
        String name = "Adarshraddi";
        String dob = "2004-12-24"; 
        int empId = 266;
        double salary = 55000.75;
        Employee emp = new Employee (name, empId, salary);
        emp.displayEmployeeDetails();
        emp.displayAge(dob);
    }
}
