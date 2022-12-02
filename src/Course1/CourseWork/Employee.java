package Course1.CourseWork;

import java.util.Objects;

public class Employee {

    private String firstname;
    private String lastname;
    private String patronymic;
    private int department;
    private int salary;

    public Employee(String firstname, String lastname, String patronymic, int department, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public void EmployeeId() {
        int id[] = new int[10];
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }

    public String getFirstname() { return this.firstname; }

    public String getLastname() { return this.lastname; }

    public String getPatronymic() { return this.patronymic;}

    public int getDepartment() { return this.department;}

    public int getSalary() { return this.salary; }

    public void setDepartment(int department) {this.department = department; }

    public void setSalary(int salary) { this.salary = salary;}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
