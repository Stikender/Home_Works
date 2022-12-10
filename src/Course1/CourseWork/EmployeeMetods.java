package Course1.CourseWork;

public class EmployeeMetods {
    Employee[] employee = new Employee[10];

    // Сумма затрат на зарплату в месяц
    public double sumSalaryMonth(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }
// Вывод в консоль суммы затрат за месяц
    public String printSumSalaryMont(Employee[] employee) {
         return "Общая сумма затрат на заработную плату в месяц равна " + sumSalaryMonth(employee);
    }
    // найти сотрудника с min зарплатой
    public double employeeMinSalary(Employee[] employee) {
        int count = 0;
        for (; count < employee.length; ) {
            if (employee[count] != null) {
                break;
            }
            count++;
        }
        double min = employee[count].getSalary();
        for (count++; count < employee.length; count++) {
            if (min > employee[count].getSalary()) {
                min = employee[count].getSalary();
            }
        }
        return min;
    }
    // Печать минимальной зарплаты сотрудника
    public String printEmployeeMinSalary(Employee[] employee) {
        return "Минимальная зарплата сотрудника составляет " + employeeMinSalary(employee);
    }
    // найти сотрудника с max зарплатой
    public double employeeMaxSalary(Employee[] employee){
        int count1 = 0;
        for (; count1 < employee.length; ) {
            if (employee[count1] != null) {
                break;
            }
            count1++;
        }
        double max = employee[count1].getSalary();
        for (count1++; count1 < employee.length; count1++) {
            if (max < employee[count1].getSalary()) {
                max = employee[count1].getSalary();
            }
        }
        return max;
    }
    //Печать максимальной зарплаты сотрудника
    public String printEmployeeMaxSalary(Employee[] employee) {
        return "Максимальная зарплата сотрудника составляет " + employeeMaxSalary(employee);
    }
    public String printAverageSalaryMonth(Employee[] employee) {
        int averageSalaryMonth = (int) (sumSalaryMonth(employee) / employee.length);
        return "Среднее значение зарплат равно " + averageSalaryMonth;
    }
    public String employeeFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getEmployeeFullName());
        }
        return " ";
    }

}
