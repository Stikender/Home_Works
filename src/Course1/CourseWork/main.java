package Course1.CourseWork;

public class main {


    public static void main(String[] args) {
        EmployeeMetods employeeMetods = new EmployeeMetods();
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ильин Петр Семенович", 1, 30_000);
        employees[1] = new Employee("Рахипов Арсений Владимирович", 1, 27_000);
        employees[2] = new Employee("Райнова Рузанна Агнессовна", 2, 55_000);
        employees[3] = new Employee("Шахметов Исмаил Рустамович", 2, 180_000);
        employees[4] = new Employee("Пономарев Алексей Давыдович", 3, 35_000);
        employees[5] = new Employee("Раупов Закир Закирович", 3, 60_000);
        employees[6] = new Employee("Широбатов Чамшет Исмаилович", 4, 50_000);
        employees[7] = new Employee("Гаврилов Иван Гаврилович", 4, 65_000);
        employees[8] = new Employee("Фальковский Руслан Витальевич", 5, 70_000);
        employees[9] = new Employee("Нургалиев Исмар Наитович", 5, 49_000);
        for (Employee i : employees) {
            System.out.println(i);
        }
        System.out.println(employeeMetods.printSumSalaryMont(employees));
        System.out.println(employeeMetods.printEmployeeMinSalary(employees));
        System.out.println(employeeMetods.printEmployeeMaxSalary(employees));
        System.out.println(employeeMetods.printAverageSalaryMonth(employees));
        System.out.println(employeeMetods.employeeFullName(employees));

    }
}

