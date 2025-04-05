import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee(101, "Ajay", 55000);
        Employee emp2 = new Employee(102, "Prasun", 62000);
        Employee emp3 = new Employee(103, "Abhinav", 70000);

        // Store them in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("=================");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
