public class Employee extends Person {
    int empId;
    double salary;

    Employee(String name, String dobStr, int empId, double salary) {
        super(name, dobStr);
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson(); 
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "2000-12-01", 101, 55000);
        emp.displayEmployee();
    }
}
