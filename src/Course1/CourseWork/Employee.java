package Course1.CourseWork;

import java.util.Objects;

public class Employee {

    private String employeeFullName;
    private int department;
    private int salary;
    private static int id;
//    EmployeeId id = new EmployeeId();

    public Employee(String employeeFullName, int department, int salary) {
        this.employeeFullName = employeeFullName;
        this.department = department;
        this.salary = salary;
        this.id = 1;
    }
        public String getEmployeeFullName() {
            return this.employeeFullName;
        }

        public int getDepartment () {
            return this.department;
        }

        public int getSalary() {
            return this.salary;
        }

        public void setDepartment ( int department){
            this.department = department;
        }

        public void setSalary ( int salary){
            this.salary = salary;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && getSalary() == employee.getSalary() && getEmployeeFullName().equals(employee.getEmployeeFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeFullName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО = " + employeeFullName +
                ", отдел = " + department +
                ", зарплата = " + salary +
                ", id = " + (id++);
    }

}

