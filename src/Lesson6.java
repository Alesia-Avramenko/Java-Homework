
public class Lesson6 {

    // 1
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Иван Иванов", "Продавец", "ivan@mail.com", "8659236606", 2000, 30);
        Employee employee2 = new Employee(2, "Ирина Иванова", "Менеджер", "iren1234@mail.com", "579656585", 3000, 29);

        employee1.info();
        employee2.info();

// 2

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "Иван Иванов", "Менеджер", "ivanivan@mailbox.com", "89991119", 80000, 35);
        employees[1] = new Employee(2, "Ирина Петрова", "Инженер", "iren1234@mail.ru", "899922233", 200000, 42);
        employees[2] = new Employee(3, "Ольга Авдеенко", "Бухгалтер", "olya7878@mailbox.com", "899933344", 90000, 28);
        employees[3] = new Employee(4, "Алексей Гаврилкин", "Проектировщик", "alexey@mailbox.com", "899944455", 100000, 38);
        employees[4] = new Employee(5, "Евгений Смирнов", "Аналитик", "evgen@example.mailbox.com", "899955566", 150000, 31);

        for (Employee employee : employees) {
            employee.info();
            System.out.println();

        }
    }
}
