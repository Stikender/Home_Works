package Course1.CourseWork;

public class main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ильин Петр Семенович", 1, 30_000, new EmployeeId());
        employees[1] = new Employee("Рахипов Арсений Владимирович", 1, 27_000, new EmployeeId());
        employees[2] = new Employee("Райнова Рузанна Агнессовна",  2, 55_000, new EmployeeId());
        employees[3] = new Employee("Шахметов Исмаил Рустамович",   2, 180_000, new EmployeeId());
        employees[4] = new Employee("Пономарев Алексей Давыдович", 3, 35_000, new EmployeeId());
        employees[5] = new Employee("Раупов Закир Закирович", 3, 60_000, new EmployeeId());
        employees[6] = new Employee("Широбатов Чамшет Исмаилович", 4, 50_000, new EmployeeId());
        employees[7] = new Employee("Гаврилов Иван Гаврилович", 4, 65_000, new EmployeeId());
        employees[8] = new Employee("Фальковский Руслан Витальевич", 5, 70_000, new EmployeeId());
        employees[9] = new Employee("Нургалиев Исмар Наитович", 5, 49_000, new EmployeeId());
        for (Employee i : employees) {
            System.out.println(i);
        }
// Сумма затрат на зарплату в месяц
        double sumSalaryMonth = 0;
        for (int i = 0; i < 10; i++) {
            double salary = employees[i].getSalary();
            sumSalaryMonth += salary;
            if (i ==9){
                System.out.println("Общая сумма затрат на заработную плату в месяц равна " + sumSalaryMonth);
            }
        }
        // найти сотрудника с min зарплатой
        int count = 0;
        for (; count< employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        double min = employees[count].getSalary();
        for ( count++; count<employees.length; count++) {
            if (min >employees[count].getSalary()) {
                min =employees[count].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет " + min);

        // найти сотрудника с max зарплатой
        int count1 = 0;
        for (; count1 < employees.length; ) {
            if (employees[count1] != null) {
                break;
            }
            count1++;
        }
        double max = employees[count1].getSalary();
        for ( count1++; count1 < employees.length; count1++) {
            if (max < employees[count1].getSalary()) {
                max = employees[count1].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " + max);

        // Ищем среднемесячную зарплату
        int averageSalaryMonth = (int) (sumSalaryMonth / employees.length);
        System.out.println("Среднее значение зарплат равно "+ averageSalaryMonth);

        // Вывести в консоль ФИО сотрудников
        for (int i = 0; i < employees.length; i++) {
            System.out.println( employees[i].getEmployeeFullName());
        }
//        for (int i = 0; i < employee.length; i++) {
    }
}
