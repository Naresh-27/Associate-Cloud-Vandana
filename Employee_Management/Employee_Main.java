import java.util.ArrayList;
import java.util.List;

public class Employee_Main {

        public static void main(String[] args) {

            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee(1, "Arjun", 50000));
            employees.add(new Employee(2, "Bobby", 60000));
            employees.add(new Employee(3, "Chintu", 70000));

            System.out.println("Employee Details:");
            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }

}
