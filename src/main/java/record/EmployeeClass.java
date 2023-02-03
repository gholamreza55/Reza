package record;

import java.util.Objects;

import static record.EmployeeRecord.DEFAULT_EMPLOYEE_NAME;
import static record.EmployeeRecord.printWhatever;

public class EmployeeClass {
    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }


    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EmployeeClass that = (EmployeeClass) o;
        return employeeNumber == that.employeeNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }

    public static void main(String[] args) {
        EmployeeClass employees = new EmployeeClass("gholamreza", 12546);
        EmployeeRecord employeeRecord = new EmployeeRecord("mohammad", 25685);

        System.out.println(employees);
        System.out.println(employees.getName());
        System.out.println("--------------------------");
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.nametoUpperCase());
        EmployeeRecord.printWhatever();
        employeeRecord.run();
        System.out.println(DEFAULT_EMPLOYEE_NAME);

    }
}
