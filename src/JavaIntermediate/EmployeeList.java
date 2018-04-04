package JavaIntermediate;

import java.util.*;

class SortByID implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        }
        else if (o1.getId() < o2.getId()) {
            return -1;
        }
        else {
            return 0;
        }
    }

}

class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByBirthYear implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getBirthYear() > o2.getBirthYear()) {
            return 1;
        }
        else if (o1.getBirthYear() < o2.getBirthYear()) {
            return -1;
        }
        else {
            return 0;
        }
    }

}

public class EmployeeList {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        addEmployee(1, employeeList);
        Collections.sort(employeeList, new SortByBirthYear());
        printEmployee(employeeList);

    }

    public static void addEmployee(int num, Collection<Employee> coll) {
        for(int i = 0; i <= num; i++) {
            Scanner scanEmployee = new Scanner(System.in);
            System.out.println("Please enter the ID: ");
            int id = scanEmployee.nextInt();
            System.out.println("Please enter the name: ");
            String name = scanEmployee.next();
            System.out.println("Please enter the birth year: ");
            int birthYear = scanEmployee.nextInt();


            Employee employee = new Employee(id, name, birthYear);
            coll.add(employee);
        }
    }

    public static void printEmployee(Collection<Employee> coll) {
        for (Employee employee : coll) {
            System.out.println(employee);
        }
    }

}
