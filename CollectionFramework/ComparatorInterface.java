package CollectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Employee {
    String name;
    int empID;
    Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }
}

class EmployeeIDComparator implements  Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee obj1 = (Employee) o1;
        Employee obj2 = (Employee)o2;

        if(obj1.empID == obj2.empID) {
            return 0;
        }
        else if(obj1.empID > obj2.empID) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee("Modi", 420));
        employees.add(new Employee("Amit", 421));
        employees.add(new Employee("Arvi", 410));
        employees.add(new Employee("Baba", 320));
        employees.add(new Employee("Bogi", 121));

        Collections.sort(employees, new EmployeeIDComparator());

        for(Employee singleEmployee : employees) {
            System.out.println("Employee Name : " + singleEmployee.name + " Employee ID : " + singleEmployee.empID);
        }
    }
}
